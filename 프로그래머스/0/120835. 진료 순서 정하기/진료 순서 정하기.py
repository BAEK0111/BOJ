def solution(emergency):
    answer = []
    sorted_emergency = sorted(emergency, reverse = True)
    
    for i in range(0, len(emergency)):
        for j in range(0, len(sorted_emergency)):
            if emergency[i] == sorted_emergency[j]:
                answer.append(j + 1)
    return answer