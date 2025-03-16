package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = Integer.parseInt(st.nextToken());
        }

        List<Integer> answerList = new ArrayList<>();
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] > arr[i-1]){
                answerList.add(arr[i]);
            }
            if(i==1){
                answerList.add(arr[i-1]);
            }
        }
        Collections.reverse(answerList);

        for (Integer i : answerList) {
            System.out.print(i + " ");

        }

        br.close();
    }
}
