import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vocab = input.next();
        int k = 1;

        for(int i = 0; i < vocab.length() / 2; i++){
            if(vocab.charAt(i) != vocab.charAt(vocab.length() - 1 - i)){
                k = 0;
                break;
            }
        }
        System.out.println(k);
    }
}