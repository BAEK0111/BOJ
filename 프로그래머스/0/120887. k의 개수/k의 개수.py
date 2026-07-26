def solution(i, j, k):
    return sum(str(i).count(str(k)) for i in range(i, j+1))