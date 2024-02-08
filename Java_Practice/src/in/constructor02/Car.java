package in.constructor02;

// /public class Car extends Vehicle {
	
	// /String drive;
	
	// /Car(String drive){   
		                             
		/*The 1st line inside every constructor should be this() or super() but not both at a time            
		If we not give anything compiler gives super().here super() is by default and this super() is vehicle it will check vehicle class
		At Line-x we will get Compile time error due to there is no No Args constructor in the vehicle class
		Note:- by default super() checks for no args constructor in super class if presents no issue otherwise it will be Compile time error*/
		
		//Line-x 
		// /this.drive = drive;                  
	// /}

	// /Car(String type, int speed , String drive) {   
		// /super(type, speed);          // Here by this super it will check Vehicle class, that class having constructor at 7th line so no error
	//	/this(drive);                 //Line-y           //this() or super() but not both at a time due to this here compile time error will come
	// /}
	
	// /public static void main(String[] args) {
		//Car c1 = new Car("Automatic");
		// /Car c2 = new Car("FourWheeler", 180, "Manual");
		
		// /System.out.println(c1.type +"--"+ c1.speed +"--"+c1.drive);
		// /System.out.println(c2.type +"--"+ c2.speed +"--"+c2.drive);
	// /}

// /}
/* Finally Compilation fails at Line-x and Line-y (19th line)*/