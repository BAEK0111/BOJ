import heapq as hq

def solution(scoville, K):
    hq.heapify(scoville)
        
    cnt = 0
        
    while True:
        if scoville[0] >= K:
            return cnt
        if len(scoville) == 1:
            return -1
        
        food1 = hq.heappop(scoville)
        food2 = hq.heappop(scoville)
        new_food = food1 + food2 * 2
        hq.heappush(scoville, new_food)
        cnt += 1
    
        
        