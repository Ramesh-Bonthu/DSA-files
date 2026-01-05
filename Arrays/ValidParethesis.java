package Arrays;
import java.util.Stack;

public class ValidParethesis {
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (ch == ')' || ch == '}' || ch == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if ((ch == ')' && top != '(') ||
            (ch == '}' && top != '{') ||
            (ch == ']' && top != '[')) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    String test1 = "(){}[]";
    String test2 = "([{}])";
    String test3 = "(]";
    String test4 = "([)]";
    String test5 = "";

    System.out.println(test1 + " -> " + isValid(test1));
    System.out.println(test2 + " -> " + isValid(test2));
    System.out.println(test3 + " -> " + isValid(test3));
    System.out.println(test4 + " -> " + isValid(test4));
    System.out.println("Empty String -> " + isValid(test5));
  }
}
