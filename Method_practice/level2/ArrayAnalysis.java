package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class ArrayAnalysis {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) {
                System.out.println(arr[i] + " is positive and " + (isEven(arr[i]) ? "even" : "odd"));
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }
        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last elements are equal");
        else if (result == 1) System.out.println("First element is greater");
        else System.out.println("Last element is greater");
    }
}
