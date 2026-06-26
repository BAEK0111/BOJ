from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, -1, 0, 1]

def solution(maps):
    row = len(maps)
    column = len(maps[0])
    visited = [[False for _ in range(column)] for _ in range(row)]
    
    def bfs(sy, sx, visited):
        q = deque([(sy, sx)])
        visited[sy][sx] = True
        
        while q:
            curr = q.popleft()
            cy = curr[0]
            cx = curr[1]
            
            
            for i in range(4):
                ny = cy + dy[i]
                nx = cx + dx[i]
                
                if 0 <= ny < row and 0 <= nx < column:
                    if not visited[ny][nx] and maps[ny][nx] == 1:
                        q.append((ny, nx))
                        maps[ny][nx] = maps[cy][cx] + 1
                        visited[ny][nx] = True      
    

    bfs(0, 0, visited)
    

    return -1 if maps[row-1][column-1] == 1 else maps[row-1][column-1]