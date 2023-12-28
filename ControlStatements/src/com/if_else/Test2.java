package com.if_else;

import java.util.Scanner;

class DB{
	private static final String storedUsername = "admin";
	private static final String storedPassword = "admin";
	
	public static String getUsername(){
		return storedUsername;
	}
	public static String getPassword(){
		return storedPassword;
	}
	
}


class LoginSystem{
	public static void loginCredentials(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String enteredUsername = sc.next();
		if(enteredUsername.equals(DB.getUsername())){
			System.out.println("Inside outer if-block");
			System.out.println("Enter your password");
			String enteredPassword = sc.next();
			if(enteredPassword.equals(DB.getPassword())){
				System.out.println("Welcome "+enteredUsername);
			}else{
				System.out.println("Wrong password.Login failed!!!");
			}
		}else{
			System.out.println("Invalid username");
		}
	}
}



public class Test2 {

	public static void main(String[] args) {
		LoginSystem.loginCredentials();

	}

}
