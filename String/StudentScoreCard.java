package string;
import java.util.*;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10;
            scores[i][1] = rand.nextInt(90) + 10;
            scores[i][2] = rand.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 75) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 45) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-10s%n", 
                          "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-10s%n",
                              (i+1), scores[i][0], scores[i][1], scores[i][2],
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScoreCard(scores, results, grades);

        sc.close();
    }
}

