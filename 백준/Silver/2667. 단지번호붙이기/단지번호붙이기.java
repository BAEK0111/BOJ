import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};
    static int v = 0;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    v = 0;
                    visited[i][j] = true;
                    result.add(dfs(i,j));
                }
            }
        }
        System.out.println(result.size());
        Collections.sort(result);
        for(int val : result) System.out.println(val);
    }

    private static int dfs(int y, int x) {
        v++;
        visited[y][x] = true;
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny >= 0 && nx >= 0 && ny < N && nx < N){
                if(map[ny][nx] == 1 && !visited[ny][nx]){
                    visited[ny][nx] = true;
                    dfs(ny, nx);
                }
            }
        }
        return v;
    }
}