import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import edu.neumont.csc380.ReflectionActivity;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 11/07/13 Time:
 * 17:38 To change this template use File | Settings | File Templates.
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("edu.edu.neumont.csc380.ReflectionActivity");

		for (Constructor<?> con : clazz.getConstructors()) {
			String output = "Found constructor ";
			output += clazz.getSimpleName();
			output += "(";
			for (Class<?> param : con.getParameterTypes()) {
				output += param.getName() + ", ";
			}
			if (output.endsWith(", "))
				output = output.substring(0, output.length() - 2);
			output += ")";
			System.out.println(output);
		}

		ReflectionActivity ref = (ReflectionActivity) clazz.getConstructor(
				String.class, double.class).newInstance("First", 02d);

		for (Field field : clazz.getDeclaredFields()) {
			System.out.println(String.format("Found field %s %s", field
					.getType().getSimpleName(), field.getName()));
		}

		System.out.println("Using addToNumber(22d), result is: "
				+ clazz.getMethod("addToNumber", double.class).invoke(ref, 22));
	}

}
