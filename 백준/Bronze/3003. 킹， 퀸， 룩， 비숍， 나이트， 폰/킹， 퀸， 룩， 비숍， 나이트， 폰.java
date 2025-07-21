import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer [] arr = new Integer[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < arr.length; i++) {
            int num = input.nextInt();
            arr[i] -= num;
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}