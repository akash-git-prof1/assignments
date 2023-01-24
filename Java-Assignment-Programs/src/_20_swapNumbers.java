import java.util.Scanner;

public class _20_swapNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 :");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping: Number 1 : "+num1+" Number 2: "+num2);
		
		int temp = num1;
		num1= num2;
		num2 = temp;
		
		System.out.println("After Swapping: Number 1 : "+num1+" Number 2: "+num2);
	}

}
