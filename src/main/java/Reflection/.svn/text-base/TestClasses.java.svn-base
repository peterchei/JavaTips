package Reflection;

import java.awt.Button;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClasses {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c1 = java.awt.Button.class;
		Class c2 = Class.forName("java.awt.Button");

		System.out.println(c1.getSuperclass());

		printModifiers(new Button());
		printInterfaceNames(new Button());
		printFieldNames(new Button());
		showConstructors(new Button());
		showMethods(new String("A"));

	}

	static void showConstructors(Object o) {
		Class c = o.getClass();
		Constructor[] theConstructors = c.getConstructors();
		for (int i = 0; i < theConstructors.length; i++) {
			System.out.print("( ");
			Class[] parameterTypes = theConstructors[i].getParameterTypes();
			for (int k = 0; k < parameterTypes.length; k++) {
				String parameterString = parameterTypes[k].getName();
				System.out.print(parameterString + " ");
			}
			System.out.println(")");
		}
	}

	static void showMethods(Object o) {
		Class c = o.getClass();
		Method[] theMethods = c.getMethods();
		for (int i = 0; i < theMethods.length; i++) {
			String methodString = theMethods[i].getName();
			System.out.println("Name: " + methodString);
			String returnString = theMethods[i].getReturnType().getName();
			System.out.println("   Return Type: " + returnString);
			Class[] parameterTypes = theMethods[i].getParameterTypes();
			System.out.print("   Parameter Types:");
			for (int k = 0; k < parameterTypes.length; k++) {
				String parameterString = parameterTypes[k].getName();
				System.out.print(" " + parameterString);
			}
			System.out.println();
		}
	}

	static void printFieldNames(Object o) {
		Class c = o.getClass();
		Field[] publicFields = c.getFields();
		for (int i = 0; i < publicFields.length; i++) {
			String fieldName = publicFields[i].getName();
			Class typeClass = publicFields[i].getType();
			String fieldType = typeClass.getName();
			System.out.println("Name: " + fieldName + ", Type: " + fieldType);
		}
	}

	static void printSuperclasses(Object o) {
		Class subclass = o.getClass();
		Class superclass = subclass.getSuperclass();
		while (superclass != null) {
			String className = superclass.getName();
			System.out.println(className);
			subclass = superclass;
			superclass = subclass.getSuperclass();
		}
	}

	static void printInterfaceNames(Object o) {
		Class c = o.getClass();
		Class[] theInterfaces = c.getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

	public static void printModifiers(Object o) {
		Class c = o.getClass();
		int m = c.getModifiers();
		if (Modifier.isPublic(m))
			System.out.println("public");
		if (Modifier.isAbstract(m))
			System.out.println("abstract");
		if (Modifier.isFinal(m))
			System.out.println("final");
	}

	static void verifyInterface(Class c) {
		String name = c.getName();
		if (c.isInterface()) {
			System.out.println(name + " is an interface.");
		} else {
			System.out.println(name + " is a class.");
		}
	}

}
