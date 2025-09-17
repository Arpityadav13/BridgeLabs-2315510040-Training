package Level_2_Arrays_Practice_Programs;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        int[] freq = new int[10];
        
        while (number > 0) {
            int digit = (int)(number % 10);
            freq[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}

