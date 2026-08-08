import math

def solution(progresses, speeds):
    days = [100-p for p in progresses]
    for i in range(len(speeds)):
        days[i] = math.ceil(days[i] / speeds[i])
        
    work = []
    answer = []
    
    for d in days:
        cnt = 1
        if not work:
            work.append(d)
            answer.append(cnt)
        else:
            if work[-1] >= d:
                answer[-1] += 1
            else:
                work.append(d)
                answer.append(cnt)

    return answer