import java.util.Scanner;

public class _16_multiplicationTable {

	public static void main(String[] args) {

		System.out.println("Enter Table Value:");
		Scanner sc  = new Scanner(System.in);
		int tableVal = sc.nextInt();
		
		System.out.println("Enter Table Limit:");
		int limitVal = sc.nextInt();
		
		for (int i=1;i<=limitVal;i++) {
			System.out.println(tableVal + " x " + i + " = "+ i*tableVal);
		}
		
	}

}
