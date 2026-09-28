import java.util.*;
import java.io.*;

class Solution {
    static boolean[] visited;
    
    public static void bfs(int node, int n, int[][] computers, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        
        while(!q.isEmpty()) {
            int cur_node = q.poll();
            for(int i = 0; i < n; i++) {
                if(computers[cur_node][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int num = computers.length;
        visited = new boolean[num];
        int answer = 0;
        
        for(int i = 0; i < num; i++) {
            if(!visited[i]) {
                bfs(i, n, computers, visited);
                answer++;
            }
        } 
        return answer;
    }
}