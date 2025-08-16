package Level_3_Loop_Practice_Programs;

import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}

