package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int[] arr = new int[n];
        
        /*숫자 뒤집기
            int result = 0;
            int num = 123;
            while(num>0){ // 더이상 몫이 없을떄까지
                int t = num % 10;// 1의 자리 구하기
                result += result*10 + t;// 기존것에 10을 곱에 숫자 한칸 미는 효과 구현
                num = num /10;
            }
            System.out.print(result);  //뒤집은 숫자 출력
         */


        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            arr[i] = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
        }

        for (int i : arr) {
           if(isPrime(i)){
               System.out.print(i + " ");
            };
        }


        br.close();
    }

    public static boolean isPrime(int i){
        boolean flag = false;
        int cnt = 0;
        for (int j = 1; j <= i; j++) {
            if(i % j == 0){
                cnt++;
            }
        }
        if(cnt ==2){
            flag = true;
        }

        return flag;
    }
}
