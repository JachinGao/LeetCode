public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(-121);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long n = 0;
        long temp = x;

        while (temp != 0) {
            n = temp % 10 + n * 10;
            temp = temp / 10;
        }
        return x == n;
    }
}
