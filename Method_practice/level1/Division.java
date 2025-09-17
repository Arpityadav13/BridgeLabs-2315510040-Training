package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder: " + result[0] + ", Quotient: " + result[1]);
    }
}

