import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> poketmon = new HashMap<>();
        
        for(int n: nums) {
            poketmon.put(n, poketmon.getOrDefault(n, 0) + 1);
        }
        
        
        int answer = Math.min(poketmon.size(), nums.length / 2);
        return answer;
    }
}