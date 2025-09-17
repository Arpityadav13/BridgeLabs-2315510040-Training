package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class NaturalSum {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Recursive Sum: " + sumRecursive);
        System.out.println("Formula Sum: " + sumFormula);
    }
}

