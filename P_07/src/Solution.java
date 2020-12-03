import java.util.ArrayList;
/*
7. 整数反转
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int reverse = solution.reverse(153423646);
        System.out.println(reverse);

        int i = solution.optimalSolution(-1534236469);
        System.out.println(i);
    }


    public int optimalSolution(int x) {
        long n = 0;
        while (x != 0) {
            n = x % 10 + n * 10;
            x = x / 10;
            System.out.println(n);
        }

        return (int) n == n ? (int) n : 0;
    }

    public int reverse(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPositive = x >= 0;
        int temp = isPositive ? x : -x;

        while (temp > 0) {
            list.add(temp % 10);
            temp = temp / 10;
        }

        long val = 0;

        for (Integer integer : list) {
            val = integer + val * 10;
        }
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) (isPositive ? val : -val);
    }
}
