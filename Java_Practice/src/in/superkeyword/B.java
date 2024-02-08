package in.superkeyword;

public class B extends A{
	int a = 20;
	
	B(){                                                     //Parent Constructor implicitly called by JVM no need call by super keyword
		System.out.println("This is child constructor");
	}
	
	public void student() {
		
		System.out.println("This is derived class");
		System.out.println(a);
		
		System.out.println(super.a); //we can access without super kw,by creating object in main method to parent class but that is method ol way
		super.student();
		
		//student();                             // If you write this, it will go recursion continue student method will execute
	
	}

}

/* This super keyword used in inheritance concept
 * Method override also we can see in inheritance concept, we can over ride parent methods in the child class but if that method is [ static ] or 
 * declared as [ final ] then there is no way for method override */
