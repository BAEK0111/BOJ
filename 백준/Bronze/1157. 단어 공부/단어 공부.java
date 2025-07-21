import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vocab = input.next();
        vocab = vocab.toLowerCase();
        int [] words = new int[26];
        Arrays.fill(words,0);

        int max = 0;
        for(int i = 0; i < vocab.length(); i++){
            // 나온 알파벳 개수 세기
            words[vocab.charAt(i)-'a']++;
            // 알파벳 개수가 max 보다 많다면 max 업데이트
            if(words[vocab.charAt(i)-'a'] > max){
                max = words[vocab.charAt(i)-'a'];
            }
        }

        // max가 1개인지 여러 개 인지 확인하기
        ArrayList<Integer> maxIndex = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i] == max){
                maxIndex.add(i);
            }
        }

        System.out.println(maxIndex.size() == 1 ? (char) (maxIndex.get(0) + 'A') : "?");
    }
}