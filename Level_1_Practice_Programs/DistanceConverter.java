package Level_1_Practice_Programs;

import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        
        System.out.println("The distance in feet is " + distanceInFeet + 
                           ", in yards is " + distanceInYards + 
                           " and in miles is " + distanceInMiles);
    }
}
