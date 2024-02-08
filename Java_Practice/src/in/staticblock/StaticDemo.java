package in.staticblock;

public class StaticDemo {
	
	public static int a = 10;
	
	public static void display() {
		System.out.println("This is execute after static block execution only");
	}
	
	static {                                                 //This block will execute first after main method taken ref as 'a' from this class
		System.out.println("This is static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main method");                 // This main method statement also be the next to Static block 
	
		System.out.println(a);                            // If this main class from another class then by this class name we can call [StaticDemo.a]    
		display();

	}

}

/* If any reference is provided in main method for static block, then that static block automatically execute, here 'a' is reference for class*/
