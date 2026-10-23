import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        ArrayList<String> pb = new ArrayList<>();

        for(String number: phone_book) {
            pb.add(number);
        }
        
        Collections.sort(pb);
        
        for(int i = 0; i < pb.size() - 1; i++) {
            if(pb.get(i+1).startsWith(pb.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}