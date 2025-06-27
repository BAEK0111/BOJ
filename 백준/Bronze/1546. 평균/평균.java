import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double []scores = new double[N];

        for(int i = 0; i < N; i++){
            scores[i] = input.nextInt();
        }

        double max_score = Arrays.stream(scores).max().getAsDouble();
        double total_score = 0;

        for(int i = 0; i < N; i++){
            total_score += (scores[i] * 100) / max_score ;
        }

        double avg_score = total_score / N;
        System.out.println(avg_score);
    }
}