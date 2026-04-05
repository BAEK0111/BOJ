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
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(map[N-1][M-1]);
    }

    private static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{y,x});
        visited[y][x] = true;

        while(!q.isEmpty()) {
            int [] current = q.poll();
            int nowY = current[0];
            int nowX = current[1];

            for (int i = 0; i < 4; i++) {
                int ny = nowY + dy[i];
                int nx = nowX + dx[i];

                if(ny >= 0 && nx >= 0 && ny < N && nx < M) {
                    if (map[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        map[ny][nx] = map[nowY][nowX] + 1;
                        q.add(new int[]{ny, nx});
                    }
                }
            }
        }
    }
}