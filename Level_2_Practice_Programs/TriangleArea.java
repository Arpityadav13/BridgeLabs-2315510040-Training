package Level_2_Practice_Programs;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base in cm: ");
        float baseCm = sc.nextFloat();
        
        System.out.print("Enter the height in cm: ");
        float heightCm = sc.nextFloat();
        
        float areaCm2 = 0.5f * baseCm * heightCm;
        float areaIn2 = areaCm2 / (2.54f * 2.54f);
        
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
    }
}
