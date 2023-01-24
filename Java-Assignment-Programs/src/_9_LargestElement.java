
public class _9_LargestElement {
	static int temp;
	public static void main(String[] args) {
		
		int[] num = {20,5,40,100,5};
		temp = num[0];
		for (int i = 0;i<num.length;i++) {
			if (temp<num[i]) {
				temp = num[i];
			}
		}
		System.out.println("Largest: "+temp);
	}

}
