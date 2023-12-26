package in.javaLearning;

class Employee{
	int empId;
	String empName ;
	
	
	public Employee(int id,String name){
		empId = id;
		empName = name;
	}
	
	public void showData(){
		System.out.println("id :"+empId+" name :"+empName);
	}
}


public class Constructor_II {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Harsh");
		e1.showData();
		Employee e2 = new Employee(102,"Aman");
		e2.showData();

	}

}
