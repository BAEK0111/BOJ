import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = new StringBuilder(input.next()).reverse().toString();
        String m = new StringBuilder(input.next()).reverse().toString();

        int n2 = Integer.parseInt(n);
        int m2 = Integer.parseInt(m);

        System.out.println(Math.max(n2, m2));
    }
}