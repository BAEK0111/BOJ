def solution(sizes):
    return max([min(x) for x in sizes]) * max([max(x) for x in sizes])