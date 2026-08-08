def solution(progresses, speeds):
    days = [100-p for p in progresses]
    for i in range(len(speeds)):
        days[i] = days[i] // speeds[i] if days[i] % speeds[i] == 0 else days[i] // speeds[i] + 1
        
    work = []
    answer = []
    
    print(days)
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