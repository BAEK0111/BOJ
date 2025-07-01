import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        int length = S.length();
        int res = 0;

        for(int i = 0; i < length; i++){
            char ch = S.charAt(i);
            if(ch < 'D') res += 3;
            else if(ch < 'G') res += 4;
            else if(ch < 'J')  res += 5;
            else if(ch < 'M')  res += 6;
            else if(ch < 'P')  res += 7;
            else if(ch < 'T')  res += 8;
            else if(ch < 'W')  res += 9;
            else res += 10;
        }

        System.out.println(res);
    }
}