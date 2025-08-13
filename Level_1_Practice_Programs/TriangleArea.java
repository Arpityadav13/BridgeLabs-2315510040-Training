package Level_1_Practice_Programs;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in inches: ");
        float base = sc.nextFloat();
        
        System.out.print("Enter the height of the triangle in inches: ");
        float height = sc.nextFloat();
        
        float areaInInches = 0.5f * base * height;
        float areaInCm = areaInInches * 6.4516f;
        
        System.out.println("The area of the triangle is " + areaInInches + 
                           " square inches and " + areaInCm + " square centimeters.");
    }
}
