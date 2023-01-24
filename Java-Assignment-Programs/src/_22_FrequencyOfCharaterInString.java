import java.util.Scanner;

public class _22_FrequencyOfCharaterInString {
	
	public static void main(String[] args) {
		char c ;
		boolean flag=false;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String val= sc.nextLine();
		
		System.out.println("Enter Character: ");
		c = sc.next().charAt(0); ;
		
		for (int i=0;i<val.length();i++) {
			if (c==val.charAt(i)) {
			flag = true;
			break;
		}}
			if (flag) {
				System.out.println("Character found");
			}
			else {
				System.out.println("Character NOT found");
			}
	}
	
}