def solution(order):
    string = str(order)
    # c가 '0'이 아니고, 3으로 나누어 떨어질 때만 카운트
    return sum(1 for c in string if c != '0' and int(c) % 3 == 0)