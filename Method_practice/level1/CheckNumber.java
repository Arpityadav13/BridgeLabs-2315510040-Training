package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class CheckNumber {
    public static int checkSign(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = checkSign(num);
        System.out.println("Result: " + result);
    }
}

