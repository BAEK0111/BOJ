import math

def solution(k, d):
    cnt = 0
    distance = 0
    for a in range(0, d+1, k):
        distance = d**2 - a**2
        
        cnt += (int(math.sqrt(distance)) // k + 1)
            
    return cnt
