package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 10/07/13 Time:
 * 18:37 To change this template use File | Settings | File Templates.
 */
public class Server {

	private static ServerSocket	serverSocket	= null;
	private static Socket		clientSocket	= null;

	public static void main(String[] args) {
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
				Class clazz = Class.forName("second.MathLib");
				Object instance = clazz.getConstructors()[0].newInstance();
				JsonArray params = map.get("arguments").getAsJsonArray();
				Method requestedMethod = null;
				for (Method method : clazz.getMethods()) {
					if (method.getName()
							.equals(map.get("method").getAsString())) {
						if (params.size() == method.getParameterTypes().length) {
							requestedMethod = method;
						}
					}
				}
				if (requestedMethod == null) { throw new IllegalStateException(); }

				Class[] paramClasses = requestedMethod.getParameterTypes();
				Object[] arguments = new Object[paramClasses.length];
				for (int i = 0; i < paramClasses.length; i++) {
					arguments[i] = gson
							.fromJson(params.get(i), paramClasses[i]);
				}
				outputLine = requestedMethod.invoke(instance, arguments)
						.toString();

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
