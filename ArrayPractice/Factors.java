package Level_1_Arrays_Practice_Programs;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = new int[num];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }
        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
