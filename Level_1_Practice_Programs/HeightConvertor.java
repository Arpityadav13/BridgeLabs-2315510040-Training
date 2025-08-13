package Level_1_Practice_Programs;

import java.util.Scanner;

public class HeightConvertor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        float heightCm = sc.nextFloat();
        
        float totalInches = heightCm / 2.54f;
        int feet = (int)(totalInches / 12);
        float inches = totalInches % 12;
        
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + inches);
    }
}
