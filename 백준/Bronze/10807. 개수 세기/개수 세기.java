import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        Integer [] arr = new Integer[t];
        for (int i = 0; i < t; i++) {
            arr[i] = input.nextInt();
        }
        int v = input.nextInt();
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            if(arr[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}