def solution(array, commands):
    answer = []
    for i, j, k in commands:
        sub_array = array[i-1:j]
        sorted_sub_array = sorted(sub_array)
        answer.append(sorted_sub_array[k-1])
        
    return answer