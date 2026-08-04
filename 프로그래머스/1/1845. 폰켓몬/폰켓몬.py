def solution(nums):
    set_nums = list(set(nums))
    if len(set_nums) >= len(nums) // 2:
        return len(nums) // 2
        
    return len(set_nums)