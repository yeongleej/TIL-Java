import java.util.*;
public class SubString {
    public static void main(String[] args) {
        String str = "xyb";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            while (!stack.isEmpty() && stack.peek() != null && (stack.peek() < str.charAt(i))){
                stack.pop();
            }
            stack.push(str.charAt(i));
        }
     
        StringBuilder sb = new StringBuilder();
        for (char c: stack){
            sb.append(String.valueOf(c));
        }
        System.out.println(sb);
    }
}
