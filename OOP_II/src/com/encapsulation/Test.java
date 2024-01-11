package com.encapsulation;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private String empDept;
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public int getEmpId(){
		return this.empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the emp id:");
		int empId = sc.nextInt();
		
		System.out.println("Enter the emp dept:");
		String empDept = sc.next();
		
		System.out.println("Enter the emp empName:");
		String empName = sc.next();
		
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpDept(empDept);
		
		System.out.println("Displaying the details :");
		System.out.println("EmployeeId   :"+emp.getEmpId());
		System.out.println("EmployeeName :"+emp.getEmpName());
		System.out.println("EmployeeDept :"+emp.getEmpDept());
	}

}
