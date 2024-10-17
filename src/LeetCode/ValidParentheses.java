package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                str.push(')');
            } else if (c == '{') {
                str.push('}');
            } else if (c == '[') {
                str.push(']');
            } else if (str.isEmpty() || str.pop() != c) {
                return false;
            }
        }
        return str.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
            System.out.println(vp.isValid("(){"));
    }

}
