package Reflection;

import java.lang.reflect.*;

class SampleInvoke {

   public static void main(String[] args) {
      String firstWord = "Hello ";
      String secondWord = "everybody.";
      String bothWords = append(firstWord, secondWord);
      System.out.println(bothWords);
   }

   public static String append(String firstWord, String secondWord) {
      String result = null;
      Class c = String.class;
      Class[] parameterTypes = new Class[] {String.class};
      Method concatMethod;
      Object[] arguments = new Object[] {secondWord};
      try {
        concatMethod = c.getMethod("concat", parameterTypes);
        result = (String) concatMethod.invoke(firstWord, arguments);
      } catch (NoSuchMethodException e) {
          System.out.println(e);
      } catch (IllegalAccessException e) {
          System.out.println(e);
      } catch (InvocationTargetException e) {
          System.out.println(e);
      }
      return result;
   }
}
