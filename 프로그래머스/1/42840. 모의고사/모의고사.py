def solution(answers):
    answer_1 = [1, 2, 3, 4, 5]
    answer_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    answer_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    score = [0, 0, 0]
    
    
    
    for idx, answer in enumerate(answers):
        if answer == answer_1[idx % len(answer_1)]:
            score[0] += 1
        if answer == answer_2[idx % len(answer_2)]:
            score[1] += 1
        if answer == answer_3[idx % len(answer_3)]:
            score[2] += 1
        
        
    answer = []
    max_score = max(score)
    
    for idx, s in enumerate(score):
        if s == max_score:
            answer.append(idx + 1)
    
    return answer