import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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

		try {
			clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
					true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));

			String inputLine, outputLine;

			// Do work
			while ((inputLine = in.readLine()) != null) {
                System.out.println("[DEBUG] Received payload: " + inputLine);
				JsonObject map = new JsonParser().parse(inputLine)
						.getAsJsonObject();
				switch (map.get("method").getAsString()) {
					case "subtract":
						outputLine = String.valueOf(MathLib.subtract(
								map.get("arg_1").getAsInt(), map.get("arg_2")
										.getAsInt()));
						break;
					case "add":
						outputLine = String.valueOf(MathLib.add(map
								.get("arg_1").getAsInt(), map.get("arg_2")
								.getAsInt()));
						break;
					default:
						outputLine = "invalid operation";
						break;
				}
				JsonObject payload = new JsonObject();
				payload.addProperty("result", outputLine);
				out.println(payload);
			}

			out.close();
			in.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			System.out.println("Accept failed: 8080");
			System.exit(-1);
		}
	}

}
