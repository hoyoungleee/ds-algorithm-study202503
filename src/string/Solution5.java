package string;

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char[] chars = str.toCharArray();


        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if(Character.isAlphabetic(aChar)){
                sb.append(aChar);
            }
        }

        StringBuilder reverseChar = sb.reverse();


        String flag = "YES";
        if(!sb.toString().equals(reverseChar.toString())){
            flag= "NO";
        }



        System.out.println(flag);

        sc.close();
    }
}
