package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}

