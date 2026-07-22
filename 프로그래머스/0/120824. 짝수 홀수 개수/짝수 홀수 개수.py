def solution(num_list):
    even_cnt = 0
    odd_cnt = 0
    
    for i in num_list:
        if i % 2 == 0:
            even_cnt += 1
        else:
            odd_cnt += 1
    
    answer = []
    answer.append(even_cnt)
    answer.append(odd_cnt)
    return answer