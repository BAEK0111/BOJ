import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();

        Integer [] arr = new Integer[N];

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(arr[i] < X) {
                System.out.print(arr[i]);
                if(i < N - 1)System.out.print(" ");
            }
        }
    }
}