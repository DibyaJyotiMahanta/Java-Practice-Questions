public class MatrixAdd {
    public static void main(String[] args) {
        int matrix_1[][] = {{1, 2, 3}, {4, 5, 6}};
        int matrix_2[][] = {{1, 2, 3}, {4, 5, 6}};
        int sum[][] = new int[2][3];

        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length; j++) {
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        for (int[] sum1 : sum) {
            for (int j = 0; j < sum1.length; j++) {
                System.out.print(sum1[j] + " ");
            }
            System.out.println();
        }
    }
}
