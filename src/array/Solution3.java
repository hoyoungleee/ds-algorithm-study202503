package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer A = new StringTokenizer(br.readLine(), " ");
        StringTokenizer B = new StringTokenizer(br.readLine(), " ");

        int[][] arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0){
                    arr[i][j] = Integer.parseInt(A.nextToken());
                }else{
                    arr[i][j] = Integer.parseInt(B.nextToken());

                }

            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[0][i] == arr[1][i]){
                System.out.println("D");
            }
            else if(arr[0][i] == 1 && arr[1][i] == 3){
                System.out.println("A");
            }
            else if(arr[0][i] == 2 && arr[1][i] == 1){
                System.out.println("A");
            }else if(arr[0][i] == 3 && arr[1][i] == 2){
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }

        br.close();
    }
}
