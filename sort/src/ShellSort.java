public class ShellSort {
    /**
     * 时间复杂度 o(n^1.3), 最坏情况o(n^2)
     * 不稳定排序
     * @param arr 待排序数组
     */
    public void shellSort(int[] arr) {
        int tmp;
        int n = arr.length;
        for (int dk = n / 2; dk > 0; dk /= 2) {
            for (int i = dk; i < n; i++) {
                tmp = arr[i];
                int j;
                for (j = i-dk; j >=0 && tmp<arr[j]; j-=dk) {
                    arr[j+dk] = arr[j];
                }
                arr[j+dk] = tmp;
            }
            ZLogger.printByLine("dk="+dk,arr);
        }
    }
}
