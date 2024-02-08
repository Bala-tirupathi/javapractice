package in.stringandbuffer;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		System.out.println(str);
		System.out.println(str.length());
		
		String obj = new String(" Bala");              // This is for trim the space at starting purpose
		System.out.println(obj.trim());
		
//		str.concat("Welcome");            // This will not give Welcome bc modification is not allowed in same location or address for strings
//		System.out.println(str);         // Compare with String buffer demo example 
		
		str = str.concat("Welcome");     // This concat method will work bc we have assigned to that to new reference (location)
		System.out.println(str); 
       /*How many times to user wants to change the data that many locations are created in heap memory, so wasting memory high this is main 
		disadvantage in strings*/
		
		System.out.println(str.length());
		System.out.println(str.indexOf("W"));       
		System.out.println(str.indexOf("o"));          // First o will be consider
		System.out.println(str.indexOf("w"));         // This will give -1 bc of case sensitive
		System.out.println(str.charAt(10));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);                   //Hello will output here, there is no change due above upper and lower case changes(disadvantage)
		System.out.println(str.compareTo("HelloWelcome"));   // 0 here because both strings are same there is no difference in unicode
		System.out.println(str.compareTo("helloWelcome"));   
		
	}

}

/* Unicodes 0 to 9 --> 48 to 57
 * Unicodes A to Z --> 65 to 90
 * Unicodes a to z --> 97 to 122*/
 