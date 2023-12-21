package in.javaLearning;

public class Variable_I {
	int a = 100;// instance variable

	public static void main(String[] args) {
		// classname objName = new classname();
		Variable_I obj = new Variable_I();
		// System.out.println(obj instanceof Variable_I);

		// accessing instance variable: objName.varName
		System.out.println(obj.a);

		System.out.println("-------------------------");
		Variable_I obj2 = new Variable_I();
		System.out.println(obj2.a);
		obj.a = 500;
		System.out.println(obj.a);
		System.out.println(obj2.a);

	}

}
