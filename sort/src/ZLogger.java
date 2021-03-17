public class ZLogger {

    public static void show(String name, int[] arr) {
        System.out.print("\n" + name + " ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printByLine(int index, int[] arr) {
        System.out.print("第" + index + "趟排序：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printByLine(String str, int[] arr) {
        System.out.print(str + ": ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
