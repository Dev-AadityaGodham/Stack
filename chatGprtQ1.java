import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isBalanced("(){}[]")); // true
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("{[")); // false
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
