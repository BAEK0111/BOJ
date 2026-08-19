def solution(answers):
    
    score1 = 0
    score2 = 0
    score3 = 0
    
    # 5 * 2000
    answer_1 = [1, 2, 3, 4, 5] * 2000
    # 8 * 1250
    answer_2 = [2, 1, 2, 3, 2, 4, 2, 5] * 1250
    # 10 * 1000
    answer_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 1000
    
    max_score = 0
    
    for i in range(len(answers)):
        if answers[i] == answer_1[i]: score1 += 1
        if answers[i] == answer_2[i]: score2 += 1
        if answers[i] == answer_3[i]: score3 += 1
        
        max_score = max(score1, score2, score3)
        
    answer = []
    if score1 == max_score: answer.append(1)
    if score2 == max_score: answer.append(2)
    if score3 == max_score: answer.append(3)
    
    return answer