package Level_2_Arrays_Practice_Programs;

import java.util.Scanner;

public class GradesCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " in Physics, Chemistry, and Maths:");
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Invalid input. Enter positive value again.");
                    j--;
                } else {
                    marks[i][j] = m;
                }
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + 
                               ", Chemistry=" + marks[i][1] + 
                               ", Maths=" + marks[i][2] + 
                               ", Percentage=" + percentage[i] + 
                               ", Grade=" + grade[i]);
        }
    }
}
