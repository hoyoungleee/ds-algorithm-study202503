package string;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //정답을 답을 배열
        List<Character> chars = new ArrayList<>();


        //문자 배열로 변환
        char[] charStr = str.toCharArray();

        for (int i = 0; i < charStr.length; i++) {
            //일단 넣고 다음 요소가 기존 리스트의 요소로 있는지 확인 후 없다면 insert
            if(!chars.contains(charStr[i])){
                chars.add(charStr[i]);
            }

        }
        String result ="";
        for (char c : chars) {
            result += c ;
        }

        //LinkedHashSet//연결된 중복제거 자료구조
        System.out.println(result);
        LinkedHashSet dd = new LinkedHashSet();

        /*

        k 0 0
        s 1 1
        e 2 2
        k 3 0
        k 4 0
        s 5 1
        e 6 2
        t 7 7

         */
        sc.close();



    }

}
