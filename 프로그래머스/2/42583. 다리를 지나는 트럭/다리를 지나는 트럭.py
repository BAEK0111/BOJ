from collections import deque

def solution(bridge_length, weight, truck_weights):
    truck_list = deque(truck_weights)
    bridge = deque([0 for _ in range(bridge_length)])
    sum_weight = sum(bridge)
    time = 0
    
    while truck_list:
        time += 1
        went = bridge.popleft()
        sum_weight -= went
        
        if sum_weight + truck_list[0] <= weight:
            truck = truck_list.popleft()
            bridge.append(truck)
            sum_weight += truck
        
        else:
            bridge.append(0)
                

    return time + bridge_length