public class P_35 {
    public static void main(String[] args) {
        int[] muns = {1,2,3,5};
        P_35 p_35 = new P_35();
        int target = 7;
        int i = p_35.searchInsert(muns, target);
        System.out.println("index is " + i);
    }

    /**
     * 使用折半查找法
     *
     * @param nums   输入数组
     * @param target 查找值
     * @return 返回索引
     */
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
