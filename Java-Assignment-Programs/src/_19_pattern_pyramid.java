
public class _19_pattern_pyramid {

	public static void main(String[] args) {
		System.out.println("Pattern: \n");
		for (int i = 0 ;i<10;i++) {
			for (int j = 0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pyramid: \n");
		
		int r = 5, k = 0;

	    for (int i = 1; i <= r; ++i, k = 0) {
	      for (int a = 1; a <= r - i; ++a) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	}

	}


