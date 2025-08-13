package Level_1_Practice_Programs;

public class Profit_Loss_Percentage {

	public static void main(String[] args) {
		double cost_p = 129;
		double sell_p = 191;
		
		double profit = sell_p - cost_p;
		double percentage = (profit/cost_p)*100;
		
		System.out.println("The Cost Price is INR " + cost_p + " and Selling Price is INR " + sell_p);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + percentage + "%");

	}

}
