package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}

