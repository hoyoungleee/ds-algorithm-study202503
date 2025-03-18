package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");// 환자들 위험도

        int N = Integer.parseInt(st.nextToken());//환자 명수
        int M = Integer.parseInt(st.nextToken());//추적해야 할 환자의 처음 대기번호

        Queue<Integer> q = new ArrayDeque<>();

        int mVal = 0;
        List<Integer> t = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            q.add(Integer.parseInt(st2.nextToken()));
            if(i == 2){
                
            }
        }
        int max = Integer.MIN_VALUE;
        while (true){
            if(q.poll() > max){
                max = q.poll();
            }

        }

    }
}
