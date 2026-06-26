def solution(numbers, target):
    
    def dfs(index, current_sum):
        if index == len(numbers):
            if target == current_sum:
                return 1
            else:
                return 0
        return dfs(index + 1, current_sum + numbers[index]) + dfs(index + 1, current_sum - numbers[index])
    
    answer = dfs(0,0)
    return answer