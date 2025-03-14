package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    //아스키코드 알파벳 할당(65~122)
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        //뒤집을 배열
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            //if(i>=65 && i<=122){ 알파벳 범위 내
            if(Character.isLetter(chars[i])){
                characters.add(chars[i]);
            }
        }

        Collections.reverse(characters);


        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])){
                chars[i] = characters.get(j);
                j++;
            }
        }
        System.out.println(String.valueOf(chars));

        sc.close();*/

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0, right = arr.length -1;
        while (left< right){
            if(Character.isAlphabetic(arr[left])) left++;
            else if (Character.isAlphabetic(arr[right])) right--;
            else {
                // left, right가 둘다 특수 문자가 아니라면
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;right--;
            }
        }

        String newStr = String.valueOf(arr);
        System.out.println(newStr);

    }


}
