public class SortClient {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 6, 3};
        Insert_Sort sort = new Insert_Sort();
        ZLogger.show("插入排序:", arr);
        sort.insertSort(arr);

        int[] a2 = {3, 5, 1, 8, 7, 6, 4, 2};
        ShellSort shellSort = new ShellSort();
        ZLogger.show("希尔排序:", a2);
        shellSort.shellSort(a2);

        int[] a3 = {3, 5, 1, 8, 7, 6, 4, 2};
        BubbleSort bubbleSort = new BubbleSort();
        ZLogger.show("冒泡排序:",a3);
        bubbleSort.sort(a3);

    }
}
