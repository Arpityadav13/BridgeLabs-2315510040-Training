package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4 || month == 5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean result = isSpringSeason(month, day);
        if (result) System.out.println("It's a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}
