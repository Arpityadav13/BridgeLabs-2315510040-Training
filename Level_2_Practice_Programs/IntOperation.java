package Level_2_Practice_Programs;

import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();
        
        int op1 = a + b * c;    // multiplication before addition
        int op2 = a * b + c;    // multiplication before addition
        int op3 = c + a / b;    // division before addition
        int op4 = a % b + c;    // modulus before addition
        
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }
}
