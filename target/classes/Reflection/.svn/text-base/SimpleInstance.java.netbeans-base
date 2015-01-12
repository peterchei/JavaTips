package Reflection;

import java.awt.Rectangle;
import java.lang.reflect.*;

class SampleInstance {

	public static void main(String[] args) {

		Rectangle rectangle;
		Class rectangleDefinition;
		Class[] intArgsClass = new Class[] { int.class, int.class };
		Integer height = new Integer(12);
		Integer width = new Integer(34);
		Object[] intArgs = new Object[] { height, width };
		Constructor intArgsConstructor;
		//new SortedMap();
		try {
			rectangleDefinition = Class.forName("java.awt.Rectangle");
			intArgsConstructor = rectangleDefinition
					.getConstructor(intArgsClass);
			rectangle = (Rectangle) createObject(intArgsConstructor, intArgs);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}

	public static Object createObject(Constructor constructor,
			Object[] arguments) {

		System.out.println("Constructor: " + constructor.toString());
		Object object = null;

		try {
			object = constructor.newInstance(arguments);
			System.out.println("Object: " + object.toString());
			return object;
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (InvocationTargetException e) {
			System.out.println(e);
		}
		return object;
	}
}
