import java.util.Scanner;

public class _2_FibonacciSeries {
	static int n1=0,n2=1,n3;
	int sum = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Limit:");
		int num = sc.nextInt();
		System.out.print(n1+" "+n2);
		
		for (int i =2 ;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public void hello() {
		System.out.println(sum);
	}
	
	public void hello1() {
		System.out.println(sum);
	}

}
