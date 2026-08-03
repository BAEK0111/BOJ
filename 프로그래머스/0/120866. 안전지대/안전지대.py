def solution(board):
    row = len(board)
    col = len(board[0])
    directions = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]
    
    for i in range(row):
        for j in range(col):
            if board[i][j] == 1:
                for dy, dx in directions:
                    ny = i + dy
                    nx = j + dx
                    if 0 <= ny < row and 0 <= nx < col:
                        if board[ny][nx] == 0:
                            board[ny][nx] = 2
    
    
                
    return sum(r.count(0) for r in board)