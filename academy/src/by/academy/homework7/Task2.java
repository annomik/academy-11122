package by.academy.homework7;

import java.lang.reflect.*;
import java.util.Arrays;

// Вывести с помощью рефлексии все поля и методы, сначала через 
// getMethod("name")  getMethods() getField("name") getFields()

public class Task2 {
	public static void main(String[] args) throws Exception, SecurityException {
		
		User user1 = new User("Вася", "fjfjjf", "emailfjfj");
		Class<User> userClass = User.class;
		
		Method[] methods = userClass.getMethods();
		System.out.print(" Methods: ");
		System.out.println(Arrays.toString(methods));
						
		Field oneField = userClass.getField("login");
		System.out.println("oneField: " + oneField);
		
		Field[] fields = userClass.getFields();
		System.out.println(Arrays.toString(fields));
						
		Method declaredMethod1 = userClass.getDeclaredMethod("getEmail");
		System.out.println("declaredMethod1: " + declaredMethod1);
		
		Method [] allDecMethods = userClass.getDeclaredMethods();
		System.out.print(" DeclaredMethods: ");
		System.out.println(Arrays.toString(allDecMethods));
		
		Field decField = userClass.getDeclaredField("email");
		System.out.println("declared field: " + decField);
		
		
		Field[] declaredFields = userClass.getDeclaredFields();
		System.out.print(" Declared Fields: ");
		System.out.println(Arrays.toString(declaredFields));
		
		try {
			Method oneMethod = userClass.getMethod("getLogin");
			System.out.println("oneMethod: " +oneMethod);
			
			decField.setAccessible(true);
			decField.set(user1, "newEmail");
			System.out.println(decField.get(user1));
			
			Field decFieldLogin = userClass.getDeclaredField("login");
			decFieldLogin.set(user1, "Vova");
			System.out.println(decFieldLogin.get(user1));
			
			Field decFieldpassword = userClass.getDeclaredField("password");
			decFieldLogin.set(user1, "gmgmmgmg");
			System.out.println(decFieldLogin.get(user1));
			
			Method methodForToString = userClass.getMethod("toString");
			methodForToString.setAccessible(true);
			System.out.println(methodForToString.invoke(user1));
			
		} catch (NoSuchMethodException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
