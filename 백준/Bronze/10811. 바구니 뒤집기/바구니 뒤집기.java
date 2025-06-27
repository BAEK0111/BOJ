import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int k = 1 ; k < N + 1 ; k++){
            list.add(k);
        }

        while (M-- > 0) {
            int i = input.nextInt();
            int j = input.nextInt();
            List<Integer> sub = list.subList(i - 1 , j);
            Collections.reverse(sub);
        }

        for (int k = 0 ; k < N  ; k++){
            System.out.print(list.get(k) + " ");
        }
    }
}