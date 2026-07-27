def solution(keyinput, board):
    max_width = board[0] // 2
    max_height = board[1] // 2
    
    def move(key, loc):
        if key == 'left':
            loc[0] = max(loc[0] - 1, -max_width)
        elif key == 'right':
            loc[0] = min(loc[0] + 1, max_width)
        elif key == 'up':
            if loc[1] < max_height:
                loc[1] += 1
        else:
            if loc[1] > -max_height:
                loc[1] -= 1
                
    answer = [0, 0]
    for key in keyinput:
        move(key, answer)
        
    return answer