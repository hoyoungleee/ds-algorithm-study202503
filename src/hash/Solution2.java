package hash;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution2 {

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray(); //원본 문자열
        char[] arr2 = br.readLine().toCharArray(); //비교 문자열

        if(isAna(arr1,arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    private static boolean isAna(char[] arr, char[] arr2){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean flag = true;
        for (char c : arr) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c : arr2) {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        for (Character c : map.keySet()) {
            if(map.get(c) != map2.get(c)){
                flag= false;
            }
        }


        return flag;
    }
}
//비교할 문자열 키맵 만들고 다른문자열의 문자들을 키값삼아 있다면 1씩 감소. 지우고 지우다.
// -1이 되거나 0이 아니면 false 하는 방식도 있음.

