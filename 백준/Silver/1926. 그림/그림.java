/*
BFS 알고리즘
1. 아이디어
- 2중 For -> 값 1 && 방문X => BFS
- BFS 돌면서 그림개수 + 1, 최대값 갱신

2. 시간복잡도
- BFS : O(V+E)
- V = m * n
- E = 4 * V

3. 자료구조
- 그래프 전체 지도: int[][]
- 방문 여부: bool[][]
- Queue(BFS)
 */

import java.io.*;
import java.util.*;

public class Main{
    static int n,m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {0,1,0,-1};
    static int[] dx = {1,0,-1,0};

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int maxv = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    cnt++;
                    maxv = Math.max(maxv, bfs(i,j));
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxv);
    }

    private static int bfs(int y , int x) {
        int rs = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y,x});

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int ey = curr[0];
            int ex = curr[1];

            for(int k = 0; k < 4; k++) {
                int ny = ey + dy[k];
                int nx = ex + dx[k];

                if(ny >=0 && ny < n && nx >= 0 && nx < m) {
                    if(map[ny][nx] == 1 && !visited[ny][nx]) {
                        rs++;
                        visited[ny][nx] = true;
                        q.add(new int[]{ny,nx});
                    }
                }
            }
        }
        return rs;
    }
}