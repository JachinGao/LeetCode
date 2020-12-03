import java.util.ArrayList;

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
