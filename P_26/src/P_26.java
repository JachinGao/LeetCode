public class P_26 {
    public static void main(String[] args) {
        P_26 p_26 = new P_26();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = p_26.removeDuplicates(nums);
        System.out.println("length：" + i);

        int[] nums2 = {};
        int i1 = p_26.removeDuplicates(nums2);
        System.out.println("length：" + i1);
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (nums[idx] != nums[i]) {
                idx += 1;
                nums[idx] = nums[i];
            }
        }
        return length == 0 ? 0 : idx + 1;
    }
}
