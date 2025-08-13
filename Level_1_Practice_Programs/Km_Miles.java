package Level_1_Practice_Programs;
import java.util.*;
public class Km_Miles {
	public static void main(String[] args) {
        double km; 
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble(); 
        
        double miles = km / 1.6;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
    }
}
