package com.encapsulation;

class AdminCredential{
	private final String username = "admin";
	private final String password = "admin";
	public String getUsername() {
		return username;
	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	public String getPassword() {
		return password;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		AdminCredential adminCredential = new AdminCredential();
		System.out.println(adminCredential.getUsername());
        //adminCredential.setUsername("admin123");
		//adminCredential.username = 
        System.out.println(adminCredential.getUsername());
	}

}
