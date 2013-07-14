package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 10/07/13 Time:
 * 20:24 To change this template use File | Settings | File Templates.
 */
public class Client {

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 8080)) {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			JsonObject addPayload = new JsonParser().parse(
					"{\"method\":\"add\", \"arguments\":[1,2]}")
					.getAsJsonObject();
			JsonObject subtractPayload = new JsonParser().parse(
					"{\"method\":\"subtract\", \"arguments\":[6,2]}")
					.getAsJsonObject();

			out.println(addPayload.toString());
			String response = in.readLine();
			System.out.println("Add response: " + response);
			out.println(subtractPayload.toString());
			response = in.readLine();
			System.out.println("Subtract response: " + response);
            out.println();
		} catch (IOException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

}
