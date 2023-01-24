import java.util.ArrayList;
import java.util.Scanner;

public class _7_charToString {

	public static void main(String[] args) {

		char c;
		String s = "Hello World";
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter character: ");
		c= sc.next().charAt(0);
		
		
		
		System.out.println("Character: "+c+" String: "+s);
		
		String str = String.valueOf(c);
		ArrayList<Character> c1 = new ArrayList<Character>();
		for (int i = 0 ; i<s.length();i++) {
			c1.add(s.charAt(i));
		}
		System.out.println("Character: "+c1+" String: "+str);
	}

}
