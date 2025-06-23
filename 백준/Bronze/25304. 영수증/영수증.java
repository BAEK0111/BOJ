import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, n, a, b, total = 0;
        x = input.nextInt();
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            a = input.nextInt();
            b = input.nextInt();
            total += a * b;
        }

        String result = (total == x) ? "Yes" : "No";
        System.out.println(result);
    }
}
