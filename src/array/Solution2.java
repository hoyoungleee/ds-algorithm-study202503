package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mans = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] talls = new int[mans];
        for (int i = 0; i < mans; i++) {
           talls[i] = Integer.parseInt(st.nextToken());
        }
        int max = talls[0];
        int cnt = 1;//첫번째 학생은 무조건 보여서 1로 시작.
        for (int tall : talls) {
            if(max < tall){
                cnt += 1;
                max = tall;
            }
        }

        System.out.println(cnt);

        br.close();
    }
}
