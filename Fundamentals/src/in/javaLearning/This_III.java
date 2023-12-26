package in.javaLearning;

class Student_data{
	int studentId;
	String studentName;
	
	Student_data(int studentId,String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public void showData(){
		System.out.println("Id ="+this.studentId+" Name ="+this.studentName);
	}
}
public class This_III { 

	public static void main(String[] args) {
		Student_data s = new Student_data(101,"Harsh");
		s.showData();

	}

}
