package com.exceptionhandling;

class AgeVerificationFailedException extends Exception{
	private String message;
	public AgeVerificationFailedException(String message) {
		this.message = message;
	}
	public String getErrorMessage(){
		return this.message;
	}
}

class LicenseRegistration{
	public static String getRegistration(int age){
		if(age>=18){
			return "Application processing.Please wait...";
		}else{
			try{
			throw new AgeVerificationFailedException("Age verification failed.Try Again");
		
			}catch(AgeVerificationFailedException ae){
				return ae.getErrorMessage();
			}
			
			}
		
	}
}

public class CustomException {

	public static void main(String[] args) {
		String res = LicenseRegistration.getRegistration(17);
		System.out.println(res);

	}

}
