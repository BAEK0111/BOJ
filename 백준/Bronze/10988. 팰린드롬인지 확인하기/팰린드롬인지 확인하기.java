import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vocab = input.next();
        String reversed = new StringBuilder(vocab).reverse().toString();
        System.out.println(vocab.equals(reversed) ? 1 : 0);
    }
}