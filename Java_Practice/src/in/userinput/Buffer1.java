package in.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader obj = new InputStreamReader(System.in);
		System.out.println("Enter a value");
		BufferedReader obj1 = new BufferedReader(obj);
		
		int a = Integer.parseInt(obj1.readLine());
		String str = obj1.readLine();
		
		System.out.println(a);
		System.out.println(str);

	}

}
