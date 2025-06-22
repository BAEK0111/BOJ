import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int b1 = b / 100;
        int b2 = b / 10 - b1 * 10;
        int b3 = b % 10;
        BiFunction<Integer, Integer, Integer> f = (m, n) -> m * n;
        int res3 = f.apply(a, b3);
        int res4 = f.apply(a, b2);
        int res5 = f.apply(a, b1);
        int res6 = res3 + 10 * res4 + 100 * res5;
        System.out.println(res3 + "\n" + res4 + "\n" + res5 + "\n" + res6);
    }
}
