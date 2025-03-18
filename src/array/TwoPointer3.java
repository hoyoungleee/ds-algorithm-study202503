package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointer3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken()); // 매출발생 일 수
        int K = Integer.parseInt(st1.nextToken()); // 연속된 날짜


        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(st2.nextToken());
        }

        //첫번째 K일의 매출합계산
        int maxSum = 0;
        for (int i = 0; i < K; i++) {
            maxSum += ints[i];
        }

        // 슬라이딩 윈도우로 최대 매출 계산
        // 12 15 11 20 25 10 20 19 13 15
        // 12 15 11 -> 15 11 20 -> 11 20 25
        int currentSum = maxSum;
        for (int i = K; i < N; i++) {
            currentSum += ints[i] - ints[i -K];//새로운값더하고 이전값빼기
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);

        br.close();
    }
}
