public class BillGenerator {
    public static double generateBill(Customer customer) {
        double total = 0;

        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }

        return total;
    }
}
