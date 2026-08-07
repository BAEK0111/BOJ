def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in arr:
        if not answer or answer[-1] != i:
            answer.append(i)
    return answer

