import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String S = input.next();
            for (int i = 0; i < S.length(); i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
        }
    }
}