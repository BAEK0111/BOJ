def solution(my_string, num1, num2):
    list_my_string = list(my_string)
    list_my_string[num1], list_my_string[num2] = list_my_string[num2], list_my_string[num1]
    return ''.join(list_my_string)