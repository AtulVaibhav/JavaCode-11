package in.javaLearning;

public class Variable_II {
   static int b = 200;
   
	public static void main(String[] args) {
		//accessing static data : Classname.varName
		System.out.println(Variable_II.b);
		Variable_II obj = new Variable_II();
		System.out.println(obj.b);
		
		System.out.println("---------------");
		
		Variable_II obj2 = new Variable_II();
		System.out.println(obj2.b);
		obj.b = 300;
		System.out.println(obj.b);
		System.out.println(obj2.b);
		
		
		
		
	}

}
