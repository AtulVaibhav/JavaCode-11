package com.if_else;

public class GradingSystem {
    public static String getGrade(int mark){
    	if(mark>=80){
    		return "Distinction";
    	}else if(mark>=60 && mark<80){
    		return "Ist division";
    	}else if(mark>=35 && mark<60){
    		return "IInd division";
    	}
    	return "try again";
    }
	public static void main(String[] args) {
		System.out.println(GradingSystem.getGrade(67));
	}

}
