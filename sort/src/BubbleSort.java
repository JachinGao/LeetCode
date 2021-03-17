public class BubbleSort {
    /**
     * 冒泡排序加入标志位时，有序条件下时间复杂度为：o(n)，平均复杂度为o（n^2）
     * 冒泡排序产生的有序子序列是全局有序的。
     *
     * 稳定算法
     *
     * @param arr 待排数组
     */
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    flag = true;
                }
            }

            ZLogger.printByLine(i, arr);
            if (!flag) {
                return;
            }
        }
    }
}
