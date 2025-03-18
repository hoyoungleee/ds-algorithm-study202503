package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> cards = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            cards.add(i);
        }
        // 카드가 큐에 1장 남을때 까지 반복
        while (cards.size() >1){
            cards.poll();//첫장버리세요.
            cards.offer(cards.poll());
        }
        System.out.println(cards.poll());

        br.close();

    }
}
