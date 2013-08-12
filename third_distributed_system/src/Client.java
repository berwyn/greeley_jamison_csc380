import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 11/08/13
 * Time: 22:19
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args) {
        try {
            JsonObject obj = new JsonObject();
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the fully qualified class name:");
            String className = r.readLine();
            obj.addProperty("class", className);

            System.out.println("Enter the method name:");
            String methodName = r.readLine();
            obj.addProperty("method", methodName);

            System.out.println("Is the method static? [y/N]");
            String boolval = r.readLine();
            boolean _b = boolval.equalsIgnoreCase("y");
            obj.addProperty("static", _b);

            System.out.println("Enter the number of arguments:");
            JsonArray _args = new JsonArray();
            int numArgs = Integer.valueOf(r.readLine());
            while (numArgs-- > 0) {
                JsonObject arg = new JsonObject();
                System.out.println("Enter the fully qualified class name:");
                String cName = r.readLine();
                arg.addProperty("class", cName);

                System.out.println("Enter the value:");
                String val = r.readLine();
                arg.addProperty("value", val);
                _args.add(arg);
            }
            obj.add("arguments", _args);

            Socket socket = new Socket("localhost", 8080);
            PrintWriter o = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader i = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            o.println(obj.toString());
            String res = i.readLine();
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Failed");
        }
    }

}
