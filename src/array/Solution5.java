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
        //가로방향 최고값
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += nums[i][j];
            }
            if(max < sum){
                max = sum;
            }
        }

        //세로방향 최고값
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += nums[j][i];
            }
            if(max < sum){
                max = sum;
            }
        }

        int sum2 = 0;
        //왼대각선
        for (int i = 0; i < n; i++) {

            sum2 += nums[i][i];

        }
        if(max < sum2){
            max = sum2;
        }
        // 오른 대각선
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = n-1; j >= 0; j--) {
                sum += nums[j][i];
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);

        br.close();
    }
}
