import java.util.stream.*;
import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> rainfall = new ArrayList<>();
        int maxv = 1;
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());
                map[i][j] = value;
                rainfall.add(value);
            }
        }
        
        rainfall = new ArrayList<Integer>(
            rainfall.stream().distinct().collect(Collectors.toList())
        );
        
        for(int i: rainfall) {
            int cnt = 0;
            visited = new boolean[N][N];
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    if(!visited[j][k] && !isRain(i, map[j][k])) {
                        visited[j][k] = true;
                        cnt++;
                        bfs(i, j, k);
                    }
                }
            }
            maxv = Math.max(maxv, cnt);
        }
        System.out.println(maxv);
    }
    
    private static void bfs(int rain, int y, int x) {
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[]{y, x});
        
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int nowY = curr[0];
            int nowX = curr[1];
            
            for(int i = 0; i < 4; i++) {
                int ny = nowY + dy[i];
                int nx = nowX + dx[i];
                if(ny >= 0 && nx >= 0 && ny < N && nx < N) {
                    if(!visited[ny][nx] && !isRain(rain, map[ny][nx])) {
                        visited[ny][nx] = true;
                        q.offer(new int[] {ny, nx});
                    }
                }
            }
        }
    }
    
    private static boolean isRain(int rain, int curr) {
        return curr<=rain;
    }
}