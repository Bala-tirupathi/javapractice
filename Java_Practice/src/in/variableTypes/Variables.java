package in.variableTypes;

public class Variables {
	public static int a = 10;                                         // Static variable 
	public int b = 20;                                                // Instance variable

	public static void main(String[] args) {
		
		 int c = 30;                                                 // Local variable
		 
		System.out.println("Static variabe" + " " +a);
		System.out.println("Local variable" + " " + c);
		
		Variables obj = new Variables();                            // We can access the Instance variables after creation of object only
		System.out.println("Instance variable" + " " + obj.b);
		
	}

}

/* If we want to access one class static variable and method from other another class then we can call that static variable and method by class name....
 * If its a single class we can access directly as above */
