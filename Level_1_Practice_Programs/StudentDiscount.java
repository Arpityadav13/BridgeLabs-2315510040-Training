package Level_1_Practice_Programs;

public class StudentDiscount {

	public static void main(String[] args) {
		int fee = 125000;
		float  disc_amount = (float)(fee * 0.1);
		float disc_fee = (float)(fee - disc_amount);
		System.out.println("The discount amount is INR " + disc_amount + " and final discounted fee is INR " + disc_fee);

	}

}
