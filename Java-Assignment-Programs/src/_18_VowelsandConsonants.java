import java.util.Scanner;

public class _18_VowelsandConsonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		String str = sc.nextLine();
		int length = str.length();
		str = str.toLowerCase();
		int vowel = 0,consonant=0;
		for(int i =0;i<length;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Vowel : " +vowel);
		System.out.println("Consonant : " +consonant);
		
		}

}
