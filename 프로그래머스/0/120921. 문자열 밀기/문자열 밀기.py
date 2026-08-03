from collections import deque

def solution(A, B):
    d_a = deque(A)
    d_b = deque(B)
    cnt = 0
    for i in range(0, len(A)):
        if d_a == d_b:
            cnt = i
            # if cnt >= len(A) // 2:
            #     return len(A) - cnt
            return cnt
        
        d_a.rotate(1)
            
    return -1