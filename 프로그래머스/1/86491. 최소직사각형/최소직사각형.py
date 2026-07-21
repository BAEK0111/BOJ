def solution(sizes):
    max_width = 0
    max_height = 0
    for i, j in sizes:
        max_width = max(max_width, max(i, j))
        max_height = max(max_height, min(i, j))
        
    answer = max_width * max_height
    return answer