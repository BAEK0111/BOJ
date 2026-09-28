import java.util.*;
import java.io.*;

class Solution {
    static int N, M;
    static boolean[][] visited;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    
    
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N][M];
        
        bfs(0, 0, maps);
        int answer = maps[N-1][M-1];
        return (answer == 1) ? -1 : answer;
    }
    
    public static void bfs(int sx, int sy, int[][] maps) {
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[]{sy,sx});
        visited[sy][sx] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cy = cur[0];
            int cx = cur[1];
            for(int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                
                if(ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    if (!visited[ny][nx] && maps[ny][nx] == 1) {
                        maps[ny][nx] = maps[cy][cx] + 1;
                        q.offer(new int[]{ny, nx});
                    }
                }
            }
        }
    }
}