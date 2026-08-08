from collections import deque

def solution(priorities, location):
    
    dq = deque(enumerate(priorities))
    
    answer = []
    while dq:
        priority = sorted(dq, key = lambda x: -x[1])[0][1]
        if dq[0][1] != priority:
            dq.rotate(-1)
        else:
            answer.append(dq[0][0])
            dq.popleft()
        
    
    return answer.index(location) + 1