public class P_48 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] matrix2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};

        P_48 p_48 = new P_48();
        p_48.reverse(matrix2);
        p_48.rotate(matrix2);
        System.out.println("\n");
        p_48.reverse(matrix2);
    }

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int mid = (len - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            for (int j = i; j < len - 1 - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
                matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = tmp;
            }
        }
    }

    private void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
