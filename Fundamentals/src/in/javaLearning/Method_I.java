package in.javaLearning;

public class Method_I {
   
	//non-static fn
	public void greet(){
		System.out.println("Hello");
	}
	
	public static void greet2(){
		System.out.println("static fn called");
	}
	
	public int addNumber(){
		return (10+12);//22
	}
	
	public void show(String name){
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		Method_I obj = new Method_I();
		obj.greet();
		
		Method_I.greet2();
        int result = obj.addNumber();//22
        System.out.println(result);
        
        System.out.println(obj.addNumber());
        
        obj.show("Aryan");
	}

}
