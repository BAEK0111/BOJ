import math
from functools import reduce

def check_never(signals):
    total = []
    for i in signals:
        total.append(sum(i))
    return len(set(total)) != len(total)

def check_yellow(time, signal):
    total = sum(signal)
    available_range = []
    for i in range(signal[1]):
        available_range.append(signal[0] + i + 1)
    
    if (time % total) in available_range:
        return True
    else:
        return False
    

def solution(signals):
    total = []
    for i in signals:
        total.append(sum(i))
    
    lcm_val = reduce(math.lcm, total)
    
    time = 0
    
    while True:
        time += 1
        check = True
        for signal in signals:
            if not check_yellow(time, signal):
                check = False
                continue
        if check:
            return time
        if time == lcm_val:
            return -1
                