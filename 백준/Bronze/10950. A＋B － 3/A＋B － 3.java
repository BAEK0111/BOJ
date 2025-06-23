import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,t;
        t = input.nextInt();
        for(int i = 0; i < t; i++){
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
