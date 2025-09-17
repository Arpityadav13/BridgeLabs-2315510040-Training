package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class FactorAnalyzer {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static long getProduct(int[] arr) {
        long product = 1;
        for (int i : arr) product *= i;
        return product;
    }

    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) sum += Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + getSum(factors));
        System.out.println("Sum of Squares: " + getSumOfSquares(factors));
        System.out.println("Product: " + getProduct(factors));
    }
}

