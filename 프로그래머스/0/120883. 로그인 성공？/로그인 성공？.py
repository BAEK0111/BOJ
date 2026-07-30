def solution(id_pw, db):
    answer = ''
    for info in db:
        if info == id_pw:
            print(f"id: {info[0]}, pw: {info[1]}")
            print(f"id: {id_pw[0]}, pw: {id_pw[1]}")
            return 'login'
        elif info[0] == id_pw[0]:
            print(f"id: {info[0]}, pw: {info[1]}")
            print(f"id: {id_pw[0]}, pw: {id_pw[1]}")
            return  'wrong pw'
        else:
            print(f"id: {info[0]}, pw: {info[1]}")
            print(f"id: {id_pw[0]}, pw: {id_pw[1]}")
            answer = "fail"
    
    return answer