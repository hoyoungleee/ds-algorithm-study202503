package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {

    static  int N, M, answer = 0; // N: 노드 수, M: 간선 수, answer : 찾은 경로 수
    static  int[][] graph; // 그래프 표현
    static  int[] ch; // 방문 체크 배열

    static void DFS(int v){
        if(v==N){ // 목적지 (N번 노드)에 도착했다면
            answer++;
        }else {
            for (int i = 1; i <= N; i++) {
                //v노드에서 i노드로 갈 수 있고, 아직 i 노드를 방문하지 않았다면
                if (graph[v][i] ==1 && ch[i] ==0) {
                    ch[i] = 1; // i노드 방문 체크
                    DFS(i);
                    ch[i] = 0; // 백트래킹 : i노드를 방문한 기록을 지움 (새 경로에서 또 방문 할 수 있으니까)
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());// 노드의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        // 그래프와 방문 체크 배열 초기화
        graph = new int[N+1][N+1]; // 0번 버리고 1 ~ N번 인덱스 쓸라고
        ch = new int[N+1];

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1; // a -> b 방향 연결되었다는 정보를 표시.
        }


        ch[1] = 1; //시작점 (1번 노드) 방문 체크
        DFS(1); // 1번 노드 시작.

        System.out.println(answer);
    }
}
