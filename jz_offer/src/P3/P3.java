package P3;

import java.util.HashSet;

public class P3 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int a = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (a==nums[j]){
                    return a;
                }
            }
        }
        return -1;
    }

    //hash方式
    public int findRepeatNumber2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int repeatNum = -1;
        for (int num : nums) {
            if (!set.add(num)){
                repeatNum=num;
                break;
            }
        }

        return repeatNum;
    }
}
