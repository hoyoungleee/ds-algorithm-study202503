package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] nums = new int[n][n];
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;//최대값 담을 변수
        //가로방향,세로방향 최고값
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += nums[i][j];
                colSum += nums[j][i];
            }
            max = Math.max(max,rowSum);
            max = Math.max(max,colSum);
        }


        // 왼,오른 대각선
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int sum2 = 0;
            sum2 += nums[i][i];
            for (int j = n-1; j >= 0; j--) {
                sum += nums[j][i];
            }
            max = Math.max(max,sum);
            max = Math.max(max,sum2);
        }

        // 00 11 22 33 44
        // 04 13 22 31 40
        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += nums[i][i];
            diag2Sum = nums[i][n-1-i];

        }
        max = Math.max(max,diag1Sum);
        max = Math.max(max,diag2Sum);


        System.out.println(max);

        br.close();
    }
}
