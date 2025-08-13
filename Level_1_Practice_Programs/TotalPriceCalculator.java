package Level_1_Practice_Programs;

import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the unit price (INR): ");
        float unitPrice = sc.nextFloat();
        
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
        
        float totalPrice = unitPrice * quantity;
        
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}
