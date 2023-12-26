package in.javaLearning;


class EmployeeData{
	EmployeeData(){
		System.out.println("default constructor");
	}
	
	EmployeeData(int a){
		this();// new EmployeeData()
		System.out.println("parameterized constructor");
		
	}
}
public class This_IV {

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData(10);
		
	}

}
