from collections import Counter
from collections import defaultdict

def solution(genres, plays):
    play_list = list(enumerate(zip(plays, genres)))
    
    # 최빈 장르 구하기
    most_played = defaultdict(int)
    # 장르별로 구별하기
    album = defaultdict(list)
    
    for i, (play, genre) in play_list:
        most_played[genre] += play
        album[genre].append((play, i))
            
    sorted_most_played = sorted(most_played.items(), key=lambda x: x[1], reverse = True)
    
    answer = []
    
    for smp in sorted_most_played:
        genre = smp[0]
        album_list = sorted(album[genre], key = lambda x: (-x[0], x[1]))
        for song in album_list[:2]:
            answer.append(song[1])
        
    return answer