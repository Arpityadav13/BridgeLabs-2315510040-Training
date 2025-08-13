package Level_1_Practice_Programs;

import java.util.Scanner;

public class StudentFeeDiscount {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the student fee (INR): ");
        float fee = sc.nextFloat();
        
        System.out.print("Enter the university discount percentage: ");
        float discountPercent = sc.nextFloat();
        
        float discount = (fee * discountPercent) / 100;
        float finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
