package Level_1_Practice_Programs;

import java.util.Scanner;

public class MaxHandshakes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
    }
}
