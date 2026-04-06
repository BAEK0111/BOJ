import java.util.*;
import java.io.*;

public class Main {
    static int M, N, H;
    static int[][][] map;
    static boolean[][][] visited;
    static int[] dz = {-1,1,0,0,0,0};
    static int[] dy = {0,0,-1,1,0,0};
    static int[] dx = {0,0,0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        visited = new boolean[H][N][M];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(bf.readLine());
                for(int k = 0; k < M; k++) {
                    int curr = Integer.parseInt(st.nextToken());
                    map[i][j][k] = curr;
                    if(curr == 1) {
                        q.offer(new int[]{i, j, k});
                    }
                }
            }
        }

        // 값이 1인 곳에서 동시다발적으로 bfs 호출
        bfs(q);

        boolean check = true;
        int max = 0;

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if (map[i][j][k] == 0) {
                        check = false;
                        break;
                    }
                    max = Math.max(max, map[i][j][k]);
                }
            }
        }

        if(!check) {
            System.out.println(-1);
            return;
        }
        System.out.println(max - 1);
    }

    private static void bfs(Queue<int[]> q) {
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int nowZ = curr[0];
            int nowY = curr[1];
            int nowX = curr[2];
            for(int i = 0; i < 6; i++) {
                int nz = nowZ + dz[i];
                int ny = nowY + dy[i];
                int nx = nowX + dx[i];
                if(nx >= 0 && ny >= 0 && nz >= 0 && nx < M && ny < N && nz < H) {
                    if(map[nz][ny][nx] == 0 && !visited[nz][ny][nx]) {
                        map[nz][ny][nx] = map[nowZ][nowY][nowX] + 1;
                        visited[nz][ny][nx] = true;
                        q.offer(new int[]{nz, ny, nx});
                    }
                }
            }
        }
    }
}