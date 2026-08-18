import functools

def comparator(a, b):
    t1 = a + b
    t2 = b + a
    return (int(t2) > int(t1)) - (int(t2) < int(t1))



def solution(numbers):
    numbers_str = [str(x) for x in numbers]
    sn = sorted(numbers_str, key = functools.cmp_to_key(comparator))

    answer = ''.join(sn)
    
    
    return '0' if answer[0] == '0' else answer