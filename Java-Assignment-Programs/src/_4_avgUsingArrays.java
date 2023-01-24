import java.util.Scanner;

public class _4_avgUsingArrays {

	public static void main(String[] args) {
		
		int arr [] = new int [2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter Value: ");
			arr[i]=sc.nextInt();
		}
		
		int sum = 0,j=0;

		while( j < arr.length) {
			sum = arr[j]+sum;
			j++;
		}
		
		
		System.out.println("Average: "+ ((float)sum/arr.length));
		
	}

}
