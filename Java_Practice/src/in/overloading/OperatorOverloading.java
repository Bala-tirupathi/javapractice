package in.overloading;

public class OperatorOverloading {
	int a=2, b =4;

	public static void main(String[] args) {
		
		OperatorOverloading obj = new OperatorOverloading();
		System.out.println("a+b=" + (obj.a + obj.b));   //a+b = 6    this is treated as addition
		
		System.out.println("a+b=" + obj.a + obj.b);     //a+b=24 this is treated as concatenation see the difference between both cases
		
		
	}

}
