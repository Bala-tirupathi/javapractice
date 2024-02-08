package in.stringandbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str);
		
		System.out.println(str.append(" to my world"));
		System.out.println(str);                          //Updated in the same location so no memory wasting,this is not possible in String class
		
		System.out.println(str.insert(3, "How"));         // output is WelHowcome
		System.out.println(str);                         //This is main difference b/w string class and String buffer class(same location)
		
		System.out.println(str.delete(3, 6));
		System.out.println(str.indexOf("e"));
		System.out.println(str.charAt(5));
		
		System.out.println(str.substring(7));
		System.out.println(str.subSequence(14, 19));
		
		System.out.println(str.reverse());
		System.out.println(str.length());

	}

}
