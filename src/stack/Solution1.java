package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

//        Stack<Character> stack = new Stack<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if(c == '('){
                stack.push(c); //여는 괄호는 스택에 넣자
            }else {
                // 스택이 비어있을떄 pop하면 예외가 발생하기 떄문에
                if(stack.isEmpty()){
                    System.out.println("No");
                }
                stack.pop(); // 닫는 괄호는 스택에서 여는 괄호 꺼냄.
            }
        }
        // 처리가 끝난 후  비어있지 않으면 올바른 괄호가 아니에요.
        // 올바른 괄호라면 짝이 맞기 떄문에 스택이 비어있어야함.
        if(!stack.isEmpty()){

            System.out.println("NO");
        }else {

            System.out.println("YES");
        }

        br.close();
    }
}
