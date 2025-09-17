package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = calculateBMI(weight, height);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + data[i][0] + ", Height=" + data[i][1] + ", BMI=" + data[i][2] + ", Status=" + getStatus(data[i][2]));
        }
    }
}

