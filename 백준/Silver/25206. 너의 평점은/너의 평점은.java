import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = new String[20];
        Double[] credit = new Double[20];
        String[] grade = new String[20];

        List<String> creditList = new ArrayList<>(Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"));
        double scoreSum = 0.0;
        double creditSum = 0.0;

        for (int i = 0; i < 20; i++) {
            String input = sc.nextLine();
            subject[i] = input.split(" ")[0];
            credit[i] = Double.parseDouble(input.split(" ")[1]);
            grade[i] = input.split(" ")[2];
            if (creditList.contains(grade[i])) {
                creditSum += credit[i];
                scoreSum += gradeToScore(grade[i]) * credit[i];
            }
        }
        System.out.println(scoreSum / creditSum);
    }

    private static double gradeToScore(String score) {
        if (score.equals("A+")) return 4.5;
        else if (score.equals("A0")) return 4.0;
        else if (score.equals("B+")) return 3.5;
        else if (score.equals("B0")) return 3.0;
        else if (score.equals("C+")) return 2.5;
        else if (score.equals("C0")) return 2.0;
        else if (score.equals("D+")) return 1.5;
        else if (score.equals("D0")) return 1.0;
        else if (score.equals("F")) return 0.0;
        else throw new InvalidParameterException();
    }
}