import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        Integer[] arr = new Integer[26];
        Arrays.fill(arr, -1);

        for(int i = 0; i < S.length(); i++){
            if(arr[S.charAt(i) - 'a'] == -1){
                arr[S.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}