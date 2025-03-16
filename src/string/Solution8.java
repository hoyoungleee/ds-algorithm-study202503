package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        sc.nextLine();
//
//        String msg = sc.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String msg = br.readLine();

        //4
        //#****###**#####**#####**##**
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cnt; i++) {

            String temp = msg.substring(i * 7, (i * 7) + 7)
                         .replace('#', '1')
                         .replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer.append((char) num);
        }
        System.out.println("answer = " + answer);

        br.close();
    }
}


