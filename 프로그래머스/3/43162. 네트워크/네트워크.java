class Solution {
    private static boolean visited[];
    
    private static void bfs(int node, int[][] computers) {
        visited[node] = true;
        for(int i = 0; i < computers[node].length; i++) {
            if(!visited[i] && node != i && computers[node][i] == 1) {
                bfs(i, computers);
            }   
        }
    }
    
    public int solution(int n, int[][] computers) {
        int len = computers.length;
        visited = new boolean[len];
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(!visited[i]) {
                bfs(i, computers);
                cnt += 1;
            }
        }
        
        return cnt;
    }
}