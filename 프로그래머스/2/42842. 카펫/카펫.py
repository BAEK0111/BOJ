def solution(brown, yellow):
    # 가로 : x 세로 : y
    # brown: 2x + 2y - 4 = k
    # 2x + 2y = 4 + k x + y = 2 + k/2
    # y = 2 + k/2 - x
    # yellow: (x - 2) * (y - 2) 
    
    for i in range(1, int(yellow**0.5) + 1):
        if yellow % i == 0:
            width = yellow // i + 2
            height = i + 2
            if (width + height - 2) * 2 == brown:
                return [width, height]
    