import java.util.Stack;

public class P_20 {
    public static void main(String[] args) {
        P_20 p_20 = new P_20();
        boolean valid = p_20.isValid(")");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            switch (aChar) {
                case '[':
                case '(':
                case '{':
                    stack.push(aChar);
                    break;
                default:
                    if (stack.size() == 0) {
                        return false;
                    }
                    Character peekChar = stack.peek();
                    if (aChar == ']' && peekChar == '['
                            || aChar == ')' && peekChar == '('
                            || aChar == '}' && peekChar == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
