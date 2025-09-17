package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5km: " + rounds);
    }
}

