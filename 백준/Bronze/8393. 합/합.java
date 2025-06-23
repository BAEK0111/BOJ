import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double result = Math.pow(n,2) + n;
        System.out.println((int)result/2);
    }
}
