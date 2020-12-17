public class P_27 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        P_27 p_27 = new P_27();

        int[] arr = {0,1,2,2,3,0,4,2};
        int i = p_27.removeElement(arr, 2);
        System.out.println("len:" + i);

        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                if (i != idx) {
                    nums[idx] = nums[i];
                }
                idx++;
            }
        }
        return idx;
    }
}
