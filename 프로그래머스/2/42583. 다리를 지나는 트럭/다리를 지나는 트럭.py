from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    tw = deque(truck_weights)
    bridge = deque([0 for _ in range(bridge_length)])
    
    time = 0
    sum_weight = sum(bridge)
    
    while tw:
        time += 1
        went = bridge.popleft()
        sum_weight -= went
        if weight >= sum_weight + tw[0]:
            truck = tw.popleft()
            bridge.append(truck)
            sum_weight += truck
        else:
            bridge.append(0)
    
    answer = time + bridge_length
    return answer