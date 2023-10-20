package sum;

import java.util.Scanner;
import java.util.Stack;
public class ValidPArentheses {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String s = sc.nextLine();
	       sc.close();
	       Stack<Character> stack = new Stack<>();
	           boolean valid=true;
	           for (char c : s.toCharArray()) {
	               if (c == '(' || c == '{' || c == '[') {
	                   stack.push(c);
	               } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                   stack.pop();
	               } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                   stack.pop();
	               } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                   stack.pop();
	               } else {
	                    valid= false;
	               }
	           }
	           valid=valid&&stack.isEmpty();
	           System.out.println(valid);

	       }
 
}
