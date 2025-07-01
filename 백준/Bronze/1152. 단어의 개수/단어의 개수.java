import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int res = S.trim().isEmpty() ? 0 : S.trim().split(" ").length;
        System.out.println(res);
    }
}