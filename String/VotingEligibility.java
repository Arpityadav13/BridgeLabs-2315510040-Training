package string;

import java.util.*;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);
            if (age < 0) {
                results[i][1] = "false";
            } else if (age >= 18) {
                results[i][1] = "true";
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        for (String[] row : results) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] results = checkEligibility(ages);
        displayResults(results);
        sc.close();
    }
}
