def solution(citations):
    sc = sorted(citations)
    print(sc)
    total = len(sc)
    max_h = 0
    cur_index = 0
    
    # cur_value: 0 1 3 5 6
    # cur_index: 0 1 2 3 4
    # i:         0 1 2 3 4 5 6
    for i in range(sc[-1] + 1):
        cur_value = sc[cur_index]
        
        if i <= cur_value: 
            q = total - cur_index
            nq = cur_index
            if q >= i and nq <= i:
                max_h = i
        
        while i > sc[cur_index]:
            cur_index += 1

        
    return max_h


# 6 5 3 1 0
# 1 2 3 4 5
#((1, 6), (2, 5), (3, 3), (4, 1), (5, 0))
# def solution(citations):
#     citations.sort(reverse=True)
#     answer = max(map(min, enumerate(citations, start=1)))
#     return answer
