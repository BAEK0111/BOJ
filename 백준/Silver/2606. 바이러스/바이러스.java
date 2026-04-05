/*
그래프 알고리즘
1. 아이디어
- 값 1 && 방문X => BFS
- BFS를 통해 찾은 값중 가장 최솟값 저장

2. 시간복잡도
- O(V+E)
- V = M * N, E = 4 * M * N
- 5(M * N) ~= M * N ~= 10000 < 2억 >> 가능

3. 자료구조
- 그래프 저장: int[][]
- 방문 여부: boolean[][]
- 결과값: int[]
 */
import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static ArrayList<Integer> map[];
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        map = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
        }

        for(int i = 1; i < M + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            map[S].add(E);
            map[E].add(S);
        }
        dfs(1);
        System.out.println(cnt);
    }

    private static void dfs(int node) {
        visited[node] = true;
        for(int i: map[node]) {
            if(!visited[i]) {
                cnt++;
                dfs(i);
                visited[i] = true;
            }
        }
    }
}