package in.constructor02;

public class Vehicle {
	String type = "FourWheeler";
	int speed = 220;
	
	Vehicle(String type, int speed){   // The 1st line inside every constructor should be ---> this() or super() but not both at a time
		this.speed = speed;            // If we not give anything compiler automatically take super() by default
		this.type = type;
	}

}

/* Compulsory Parent class object contains No args constructor for providing super(), otherwise it will get compile time error -
 * - but in our vehicle class we haven't provide No args constructor
 * ---> Inside Constructor we can provide this() or super() BUT not both at a time, otherwise it will get compile time error
 *  */
 