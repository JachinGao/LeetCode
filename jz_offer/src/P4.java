public class P4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int len = matrix.length;
        int idx = -1;

        for (int i = 0; i < len - 1; i++) {
            if (matrix[i][i] == target
                    || matrix[i + 1][i + 1] == target) {
                return true;
            }

            if (matrix[i][i] < target && target < matrix[i + 1][i + 1]) {
                idx = i + 1;
                break;
            }
        }

        if (idx == -1) {
            return false;
        }

        for (int i = idx; i >= 0; i--) {
            if (matrix[idx][i] == target || matrix[i][idx] == target) {
                return true;
            }
        }

        return false;
    }
}
