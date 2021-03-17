public class Insert_Sort {
    /**
     * 插入排序
     * 时间复杂度：n^2
     * 空间复杂度：1
     * 稳定性排序
     *
     * @param arr 数组
     */
    public void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i - 1;
                int x = arr[i];
                while (j >= 0 && arr[j] > x) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = x;
            }
            ZLogger.printByLine(i, arr);
        }
    }


}
