def solution(s):
    alpha = [0 for i in range(26)]
    for c in s:
        alpha[ord(c) - ord('a')] += 1
    answer = ''
    for i in range(len(alpha)):
        if alpha[i] == 1:
            answer += chr(i + 97)
    return answer