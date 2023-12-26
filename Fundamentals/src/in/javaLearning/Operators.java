package in.javaLearning;

public class Operators {
    public static void arithmeticOperators(){
    	int a = 10;
    	int b=5;
    	System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    
    public static void unaryOperators(){
    	int a = 10;
    	int b = a++;
    	
    	System.out.println(a+" "+b);
    	
    	int c = 20;
    	int d = ++c;
    	System.out.println(c+" "+d);
    	
    	
    	boolean result = true;
    	System.out.println(!result);
    	
    	int x = 20;
    	System.out.println(-x);
    }
    
    public static void relationalOperators(){
    	int a = 10;
    	int b = 5;
    	System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
    
    public static void assignmentOperator(){
    	int a  = 20;
    	System.out.println(a);
    	int b = 100;
    	b += a;// b = b+a
    	System.out.println(b);
    	
    }
    
    public static void logicalOperators(){
    	int x=20;
    	int y=50;
    	boolean result = !(!((x>y)&& (x!=y)||(x==y)));
    	System.out.println(result);
    }
    
    public static void bitwiseOperator(){
    	int x = 10;
    	int y = 14;
    	System.out.println(x&y);
    	System.out.println(x|y);
    	System.out.println(x^y);
    	System.out.println(~x+" "+ ~y);
    }
    
    public static void shiftOperator(){
    	int x=10;
    	System.out.println(x<<2);
    	
    	int y =20;
    	System.out.println(y>>2);
    }
    
    
    public static void instanceOfOperator(){
    	String str = "Java";
    	System.out.println(str instanceof String);
    	System.out.println(str instanceof Object);
    }
	public static void main(String[] args) {
		
        Operators.arithmeticOperators();
        Operators.unaryOperators();
        Operators.relationalOperators();
        Operators.assignmentOperator();
        Operators.logicalOperators();
        Operators.bitwiseOperator();
        Operators.shiftOperator();
        Operators.instanceOfOperator();
	}

}
