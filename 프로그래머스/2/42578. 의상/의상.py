import math
from collections import Counter

def solution(clothes):
    dict_clothes = dict(clothes)
    type = []
    for v in dict_clothes.values():
        type.append(v)

    counter = Counter(type)
    sum = 1
    for i in counter.values():
        sum *= (i+1)

    return sum - 1