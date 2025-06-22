import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a == b && b == c) System.out.println(10000 + a * 1000);
        else if(a == b) System.out.println(1000 + a * 100);
        else if(b == c) System.out.println(1000 + b * 100);
        else if(a == c) System.out.println(1000 + a * 100);
        else System.out.println(Math.max(Math.max(a,b),c)*100);
        
    }
}
