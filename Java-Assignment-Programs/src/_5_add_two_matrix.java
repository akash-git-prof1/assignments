
public class _5_add_two_matrix {
	public static void main(String[] args) {
        int r = 2, c = 3;
        int[][] first = { {1,2,3}, {4,5,6} };
        int[][] second = { {7,8,9}, {0,1,2} };

        int[][] sum = new int[r][c];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum: ");
        for(int[] r1 : sum) {
            for (int c1 : r1) {
                System.out.print(c1 + " ");
            }
            System.out.println();
        }
	}
}
