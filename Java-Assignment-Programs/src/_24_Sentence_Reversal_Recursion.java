import java.util.Scanner;

public class _24_Sentence_Reversal_Recursion {
	
	static void sentRev(String s , int n) {
		if (n>=0) {
		System.out.print(s.charAt(n));
		sentRev(s,n-1);
		}
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String: ");
		String sent = sc.nextLine();
		
		sentRev(sent,sent.length()-1);
		
		
	}

}
