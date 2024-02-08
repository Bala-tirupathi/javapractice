package in.thiskeyword;

/* This keyword represents the instance variable of current object */

public class A {
	
/*	int a = 24;
	public void display() {
		System.out.println(a);                // Here java treated internally (a) as (this.a)
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.display();

	} */
	
	int a = 24;                                          // Instance variable
	public void display() {
		int a = 27;                                      // Local variable but both having same variable name
		System.out.println(a);                          // output is 27 due to this is having local variable now
		System.out.println(this.a);                    // Now we can see the actual use of this keyword, here output is 24
	}

	public static void main(String[] args) {           
		A obj = new A();
		obj.display();

	}

}
