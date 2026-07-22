def solution(money):
    answer = []
    glass = money // 5500
    balance = money - glass * 5500
    answer.append(glass)
    answer.append(balance)
    return answer