import P3.P3;

public class Main {
    public static void main(String[] args) {
        //exe_p3();
        exe_p4();
    }

    private static void exe_p4() {
        int[][] arrs = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        P4 p4 = new P4();
        boolean numberIn2DArray = p4.findNumberIn2DArray(arrs, 20);
        System.out.println(numberIn2DArray);
    }

    private static void exe_p3() {
        P3 p3 = new P3();
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = p3.findRepeatNumber2(arr);
        System.out.println(repeatNumber);
    }
}
