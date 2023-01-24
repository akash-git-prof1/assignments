import java.util.Scanner;

public class _8_findValueInArray {
	static boolean flag = true;
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,22,44,66,88,199,2};
		
		System.out.print("Enter Value to Find:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i : numbers) {
			if (num == i) {
				System.out.println("Value Present");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Value not Present");
		}
		
	}

}
