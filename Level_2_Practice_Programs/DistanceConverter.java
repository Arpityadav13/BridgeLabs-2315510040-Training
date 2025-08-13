package Level_2_Practice_Programs;

import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
