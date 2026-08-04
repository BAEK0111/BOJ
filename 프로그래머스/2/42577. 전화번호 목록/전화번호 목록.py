def solution(phone_book):
    sorted_phone_book = sorted(phone_book)
    
    for i in range(1, len(sorted_phone_book)):
        if sorted_phone_book[i].startswith(sorted_phone_book[i-1]):
            return False

    return True