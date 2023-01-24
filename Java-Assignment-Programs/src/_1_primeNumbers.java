import java.util.Scanner;

public class _1_primeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numeric value:");
		int inputVal = sc.nextInt();
		boolean flag = true;
		int min = 2;
		
		while (inputVal%min!=0 && min<inputVal) {
			min++;
			flag = false;
		}
		
		
		if (flag) {
			System.out.println("Not Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}

}
