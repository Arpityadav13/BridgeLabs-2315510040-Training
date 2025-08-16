package Level_3_Loop_Practice_Programs;

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();
        double average = (physics + chemistry + maths) / 3;
        System.out.println("Average Marks: " + average);
        if (average >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (average >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (average >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (average >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        sc.close();
    }
}

