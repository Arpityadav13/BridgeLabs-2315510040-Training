package java_assignment_1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);

    }
}

