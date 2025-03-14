package string;

import java.util.Locale;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        /*
         입력 : Computercooler
         출력 : 2
        */
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String str = sc.next();
        System.out.print("문자: ");
        String c = sc.next();

        //자료형 맞추기
        str = str.toUpperCase();
        c = c.toUpperCase();
        char[] cArr = c.toCharArray();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == cArr[0]){
                cnt += 1;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
