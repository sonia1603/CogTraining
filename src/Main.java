public class Main {
	public static void main(String[] args) {
	    // Your code goes here
		MathOp obj1 = new MathOp();
		
		
		System.out.println(obj1.addition(10, 20));
		
		
	}
}

class MathOp {
	int  addition(int a, int b) {
		return a+b;
	}
	
	int subtraction(int a, int b) {
		return a - b;
	}
}