import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        a = input.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(String.format("%d * %d = %d", a,i,a*i));
        }
        
    }
}
