package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class SumNatural {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println("Sum of " + n + " natural numbers is: " + sum);
    }
}

