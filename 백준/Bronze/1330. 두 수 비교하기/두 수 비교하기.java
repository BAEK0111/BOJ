import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();

        if(a > b) System.out.println(">");
        else if(a < b) System.out.println("<");
        else System.out.println("==");
    }
}
