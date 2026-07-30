def solution(dots):
    print()
    return (max(x[0] for x in dots) - min(x[0] for x in dots)) * (max(x[1] for x in dots) - min(x[1] for x in dots))