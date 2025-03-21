package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//자연수 갯수와 K번재 자리수 받기
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");//자연수들의 나열

        int N = Integer.parseInt(st.nextToken());//카드장수
        int K = Integer.parseInt(st.nextToken());//K번쨰 자리수

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st2.nextToken()));
        }
        int rank = 1 ;
        for (Integer i : set) {
            if(rank == K){
                System.out.println(i);
            }
            rank++;
        }


    }
}