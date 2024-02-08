package in.overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		Method obj = new Method();                   //One object is created for both methods to that class, but for constructor ol needs two
		obj.m();
		obj.m(10, 20);

	}

}

/* Method over loading implements in one class and no need of inheritance concept but Method over riding implements in multiple classes with the 
help of inheritance concept*/