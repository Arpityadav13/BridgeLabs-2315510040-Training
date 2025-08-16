package Level_3_Loop_Practice_Programs;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Division by zero not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}

