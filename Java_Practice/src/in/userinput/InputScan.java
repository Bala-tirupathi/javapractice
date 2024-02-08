package in.userinput;

import java.util.Scanner;

public class InputScan {
	
	public static void main(String[] args) {
		 String name;
		 int age;
		 float salary;
		 
		Scanner sc = new Scanner(System.in);     // One object(sc) is enough all variables
		
		System.out.println("Enter the name");
		name = sc.next();
		
		System.out.println("Enter the age");
		age = sc.nextInt();
		
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
		
		System.out.println("Thankyou man");
		sc.close();                                   // Need to close the Scanner to avoid memory leakage 

	}

}
