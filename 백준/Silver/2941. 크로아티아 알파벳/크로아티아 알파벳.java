import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vocab = input.next();

        String []word = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};

        int count = 0;
        for(String s : word){
            vocab = vocab.replace(s,"#");
        }

        count += vocab.length();
        System.out.println(count);
    }
}