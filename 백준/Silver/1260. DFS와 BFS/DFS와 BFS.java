/*
그래프 알고리즘
1. 아이디어
- 2중 for , 값 1 && 방문X => DFS
- DFS를 통해 찾은 값을 저장 후 정렬해서 출력

2. 시간복잡도
- O(V+E)
- V = M * N, E = 3 * M * N
- 4(M * N) ~= M * N ~= 1000만 < 2억 >> 가능

3. 자료구조
- 그래프 저장: int[][]
- 방문 여부: boolean[][]
- 결과값: int[]
 */

import java.util.*;
import java.io.*;

public class Main {
    static int N, M, V;
    static ArrayList<Integer>[] map;
    static boolean[] visited;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new ArrayList[N+1];

        for(int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
        }

        for(int i = 1; i < M + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            map[S].add(E);
            map[E].add(S);
        }

        for(int i = 1; i < N + 1; i++) {
            Collections.sort(map[i]);
        }

        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
        System.out.println();
    }

    private static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int i: map[node]) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }

    private static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            int now_node = q.poll();
            System.out.print(now_node+ " ");
            for(int i: map[now_node]) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
