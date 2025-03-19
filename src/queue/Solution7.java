package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str1 = new StringTokenizer(br.readLine()," ");
        StringTokenizer str2 = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(str1.nextToken());
        int M = Integer.parseInt(str1.nextToken());

        Deque<Map<Integer, Integer>> queue = new ArrayDeque<>();
        int chk = 0;
        for (int i = 0; i < N; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            int j = Integer.parseInt(str2.nextToken());
            if(i == M){
                chk = j;
            }

            map.put(j,i);
            queue.offer(map);
        }

        int cnt =0;
        boolean flag = false;
        while(queue.size() >0) {
            int danger = Integer.parseInt(queue.peek().keySet().toString().replaceAll("[\\[\\]]", ""));

            if (flag) {
                if(danger == chk){
                    if(queue.peek().get(danger) > M){
                        queue.offer(queue.poll());
                        continue;
                    }
                    if (queue.peek().get(danger) < M) {
                        queue.poll();
                        cnt++;
                    }
                    else if (queue.peek().get(danger) == M){
                        cnt++;
                        break;
                    }
                }
                else {
                    queue.offer(queue.poll());
                }
            }else {
                if(queue.peek().get(danger) == (N-1)){
                    flag = true;
                }
                if( danger > chk){
                    queue.poll();
                    cnt++;
                }else {
                    queue.offer(queue.poll());
                }
            }

        }

        System.out.println(cnt);
    }
}

