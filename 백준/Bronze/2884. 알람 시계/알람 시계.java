import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h,m;
        h = input.nextInt();
        m = input.nextInt();

        if (m >= 45) System.out.println(String.format("%d %d",h,m - 45));
        else {
            if (h >= 1) System.out.println(String.format("%d %d",h - 1,m + 15));
            else System.out.println(String.format("%d %d",h + 23 ,m + 15));
        }
    }
}
