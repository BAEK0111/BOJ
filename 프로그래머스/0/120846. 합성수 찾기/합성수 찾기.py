import math

def solution(n):

    cnt = 0
    for i in range(1, n+1):
        check = True
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                check = False
                break
        if check:
            cnt += 1
            continue
    print(cnt)
    
    return n - cnt