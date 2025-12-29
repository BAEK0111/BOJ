import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alphabet[] = new int[27];
        int result = 0;

        int input = sc.nextInt();
        while (input-- > 0) {
            Arrays.fill(alphabet, 0);
            String inputString = sc.next();
            alphabet[inputString.charAt(0) - 'a']++;
            boolean check = true;

            for (int i = 1; i < inputString.length(); i++) {
                if (inputString.charAt(i - 1) != inputString.charAt(i)) {
                    alphabet[inputString.charAt(i) - 'a']++;
                }
                if (alphabet[inputString.charAt(i) - 'a'] > 1) {
                    check = false;
                    break;
                }
            }
            if (check) result++;
        }
        System.out.println(result);
    }
}