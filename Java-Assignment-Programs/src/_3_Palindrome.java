import java.util.Scanner;

public class _3_Palindrome {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String n = sc.nextLine();
		
		for (int i = 0;i<(n.length()/2);i++) {
			if (n.charAt(i)==n.charAt(n.length()-1-i)) {
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
