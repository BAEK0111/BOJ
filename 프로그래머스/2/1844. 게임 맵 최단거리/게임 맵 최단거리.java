import java.util.*;

class Solution {
    private static int[] dy = {-1, 0, 1, 0};
    private static int[] dx = {0, -1, 0, 1};
    private static boolean visited[][];
    
    private static void bfs(int sy, int sx, int[][] maps) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sy, sx});
        visited[sy][sx] = true;
        
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int cy = curr[0], cx = curr[1];
            for(int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                if(ny >= 0 && ny < maps.length && nx >= 0 && nx < maps[0].length) {
                    if(!visited[ny][nx] && maps[ny][nx] == 1) {
                        visited[ny][nx] = true;
                        maps[ny][nx] = maps[cy][cx] + 1;
                        q.offer(new int[]{ny, nx});
                    }
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        int y = maps.length;
        int x = maps[0].length;
        
        visited = new boolean[y][x];
        
        bfs(0, 0, maps);
        return visited[y-1][x-1] ? maps[y-1][x-1] : -1;
    }
}