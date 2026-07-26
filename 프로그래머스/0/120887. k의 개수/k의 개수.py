def solution(i, j, k):
    cnt = 0
    for m in range(i, j+1):
        for n in range(0, len(str(m))):
            if str(k) == str(m)[n]:
                cnt+=1
            
    return cnt