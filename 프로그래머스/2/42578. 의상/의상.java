import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String[] c: clothes) {
            hm.put(c[1], hm.getOrDefault(c[1], 0) + 1);
        }
        
        int answer = 1;
        
        for(Integer cnt: hm.values()) {
            answer *= (cnt + 1);
        }
        
        return answer - 1;
    }
}