import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 10/07/13 Time:
 * 18:37 To change this template use File | Settings | File Templates.
 */
public class Server {

	private static ServerSocket	serverSocket	= null;
	private static Socket		clientSocket	= null;

	public static void main(String[] args) throws NoSuchMethodException {
		try {
			serverSocket = new ServerSocket(8080);
		} catch (IOException e) {
			System.out.println("Could not listen on port: 8080");
			System.exit(-1);
		}

		Gson gson = new Gson();

		try {
			clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
					true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));

			String inputLine, outputLine;
			boolean running = true;

			// Do work
			while (true) {
				inputLine = in.readLine();
				running = inputLine != null;

				if (!running) {
					break;
				}

				System.out.println("[DEBUG] Received payload: " + inputLine);
				JsonObject map = new JsonParser().parse(inputLine)
						.getAsJsonObject();

				// Get the method
				Class clazz = Class.forName(map.get("class").getAsString());

				JsonArray params = map.get("arguments").getAsJsonArray();
                Class[] paramsClasses = new Class[params.size()];
                Object[] paramsArgs = new Object[params.size()];
                for(int i = 0; i < params.size(); i++) {
                    JsonObject obj = params.get(i).getAsJsonObject();
                    Class _c = Class.forName(obj.get("class").getAsString());
                    Object _o = gson.fromJson(obj.get("value"), _c);
                    paramsClasses[i] = _c;
                    paramsArgs[i] = _o;
                }

				Method requestedMethod = null;
                requestedMethod = clazz.getMethod(map.get("method").getAsString(), paramsClasses);
				if (requestedMethod == null) { throw new IllegalStateException(); }

                Object output;
                if(!map.get("static").getAsBoolean()) {
                    Object instance = clazz.getConstructors()[0].newInstance();
                    output = requestedMethod.invoke(instance, paramsArgs);
                } else {
                    output = requestedMethod.invoke(null, paramsArgs);
                }
				outputLine = output != null ? output.toString() : "Method was invoked";

				JsonObject payload = new JsonObject();
				payload.addProperty("result", outputLine);
				out.println(payload);
			}

			out.close();
			in.close();
			clientSocket.close();
			serverSocket.close();
		} catch (ClassNotFoundException | IllegalStateException
				| InstantiationException | IllegalAccessException
				| InvocationTargetException e1) {
			JsonObject payload = new JsonObject();
			payload.addProperty("result", "error");
		} catch (IOException e) {
			System.out.println("Accept failed: 8080");
			System.exit(-1);
		}
	}
}
