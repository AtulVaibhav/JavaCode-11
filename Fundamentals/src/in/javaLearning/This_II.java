package in.javaLearning;

class StudentData{
	int studentId=100;
	String studentName = "Arjun";
	
	public void showData(){
		System.out.println("Id ="+this.studentId+" Name ="+this.studentName);
	}
	
	public void callFn(){
		this.showData();
	}
}
public class This_II {

	public static void main(String[] args) {
		StudentData s = new StudentData();
		s.callFn();

	}

}
