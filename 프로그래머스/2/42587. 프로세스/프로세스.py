from collections import deque

def solution(priorities, location):
    
    dq = deque(enumerate(priorities))
    
    answer = []
    while dq:
        cur = dq.popleft()
        if any(cur[1] < q[1] for q in dq):
            dq.append(cur)
        else:
            answer.append(cur[0])
        
    
    return answer.index(location) + 1