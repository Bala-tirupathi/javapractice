package in.constructor01;

public class Student {
	
	public String name;
	public int rollnum;
	
	Student(){                                  //This is parameterless constructor to initialize variables and w/o this output will be NULL,0
		name = "Bala";
		rollnum = 24;
	}
	
	Student(String str, int n){                // This is parameter constructor
		name = str;                            // If we write any parameterized constructor we should write default constructor (must and should)
		rollnum = n;
	}

	public static void main(String[] args) {
		
		Student std = new Student();
		Student obj = new Student("Tirupathi", 27);
		
		System.out.println(std.name);
		System.out.println(std.rollnum);
		
		System.out.println(obj.name);
		System.out.println(obj.rollnum);
				
		
	}

}
