/**
 *Created on 13 Sep 2018
 * LeetCode 20. Valid Parentheses
 */
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0 || s == null) return true;
        Stack<Character> st = new Stack<>();
        char[] cs = s.toCharArray();
        for (Character c : cs) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (c == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
