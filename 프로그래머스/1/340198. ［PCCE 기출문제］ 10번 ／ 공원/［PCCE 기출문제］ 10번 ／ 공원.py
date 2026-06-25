def solution(mats, park):
    mats = sorted(mats, reverse = True)
    y = len(park)
    x = len(park[0])
    
    
    for mat in mats:        
        for i in range(y - mat + 1):
            for j in range(x - mat + 1):
                available = True

                for k in range(mat):
                    for l in range(mat):
                        if park[i+k][j+l] != "-1":
                            available = False
                            break
                
                if available:
                    return mat
    
    
    return -1