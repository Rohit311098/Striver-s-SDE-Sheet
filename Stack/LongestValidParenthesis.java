import java.util.Stack;

public class LongestValidParentheses {
   public static void main(String[] args) {
        String s1 = "()";
        String s2 = "(())";
        String s3 = "()()";
        String s4 = "(()))(()";

        System.out.println("Longest valid parentheses in \"" + s1 + "\": " + longestValidParentheses(s1));
        System.out.println("Longest valid parentheses in \"" + s2 + "\": " + longestValidParentheses(s2));
        System.out.println("Longest valid parentheses in \"" + s3 + "\": " + longestValidParentheses(s3));
        System.out.println("Longest valid parentheses in \"" + s4 + "\": " + longestValidParentheses(s4));
    }
  
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize with a base index for valid substring calculations
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Push the index of '('
            } else {
                stack.pop(); // Pop the last index
                if (stack.isEmpty()) {
                    stack.push(i); // Push the index of unmatched ')'
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek()); // Calculate valid substring length
                }
            }
        }

        return maxLen;
    }

   
}
