import java.util.Scanner;

public class _15_AlphabetCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Alphabet:");
		char c = sc.next().charAt(0);
		
		if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("It is an Alphabet");
		}
		else {
			System.out.println("Not an Alphabet");
		}
	}

}
