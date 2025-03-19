package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Deque<Integer> stack = new ArrayDeque<>();

        //352+*9-
        for (char c : s.toCharArray()) {
            //만약 c가 숫자형태의 문자라면
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {//숫자가 아니라 연산기호가 왔구나
                int b = stack.pop(); // 두 번째 피연산자
                int a = stack.pop(); // 첫 번째 피연산자

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println(stack.pop());

        br.close();
    }
}
