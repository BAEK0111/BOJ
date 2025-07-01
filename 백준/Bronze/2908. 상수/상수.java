import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int n2 = reverse(n);
        int m2 = reverse(m);
        int result = Math.max(n2, m2);
        System.out.println(result);
    }
    public static int reverse(int k) {
        int a = k % 10;
        int c = k / 100;
        int b = k / 10 - c * 10;
        return a * 100 + 10*b + c;
    }
}