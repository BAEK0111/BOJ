from collections import deque

def solution(n, computers):
    visited = [False] * n
    
    def bfs(node):
        queue = deque([node])
        visited[node] = True
        
        while queue:
            curr = queue.popleft()
            
            for i in range(len(computers[curr])):
                if not visited[i] and computers[curr][i] == 1:
                    visited[i] = True
                    queue.append(i)
                    
    answer = 0
    
    for i in range(n):
        if not visited[i]:
            bfs(i)
            answer += 1
    
    return answer