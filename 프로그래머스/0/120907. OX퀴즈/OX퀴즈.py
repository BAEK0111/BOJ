def solution(quiz):
    answer = []
    
    for q in quiz:
        x, op, y, eq, z = q.split()
        
        if op == '+':
            if int(z) == int(x) + int(y):
                answer.append("O")
            else:
                answer.append("X")
        else:
            if int(z) == int(x) - int(y):
                answer.append("O")
            else:
                answer.append("X")
            
    return answer