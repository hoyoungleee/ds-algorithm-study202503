package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr =new char[5][15];

        //입력값 처리
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            if(max<s.length()) max = s.length();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        //출력할 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                //char의 초기값은 널문자입니다. 표기 '\0'
                if(arr[i][j] == '\0'){
                continue;
            }
            sb.append(arr[i][j]);
        }

        }
        System.out.println(sb);
        br.close();
    }
}
