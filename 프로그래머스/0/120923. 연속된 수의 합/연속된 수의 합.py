def solution(num, total):
    start = ((total * 2 // num) - (num - 1)) // 2
    answer = [i for i in range(start, start + num)]
    
    return answer