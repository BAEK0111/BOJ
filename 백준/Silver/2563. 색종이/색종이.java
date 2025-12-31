import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] result = new int[100][100];

        int num = Integer.parseInt(br.readLine());
        while(num-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            for (int i = a; i < a + 10; i++) {
                for (int j = b; j < b + 10; j++) {
                    result[i][j] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (result[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}