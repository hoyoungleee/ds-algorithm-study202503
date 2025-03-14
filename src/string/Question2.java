package string;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단어갯수 : ");
        int size = sc.nextInt();
        String[] strs = new String[size];
        sc.nextLine();// 입력오류 방지 개행 지우기

        for (int i = 0; i < size; i++) {
            strs[i] = sc.nextLine();
        }
        for (String str : strs) {
            StringBuilder sb = new StringBuilder(str);
            str = sb.reverse().toString();
            System.out.println(str);
        }





        sc.close();

    }
}
