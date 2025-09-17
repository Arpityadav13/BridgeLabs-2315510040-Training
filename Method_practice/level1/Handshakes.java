package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class Handshakes {
    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}
