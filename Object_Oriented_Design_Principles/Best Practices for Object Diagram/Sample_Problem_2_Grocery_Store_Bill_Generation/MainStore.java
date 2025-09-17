public class MainStore {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 2.0, 3.0));  // 2 kg @ $3/kg
        alice.addProduct(new Product("Milk", 1.0, 2.0));    // 1 liter @ $2/liter

        double totalBill = BillGenerator.generateBill(alice);

        System.out.println("Customer: " + alice.getName());
        System.out.println("Total Bill: $" + totalBill);
    }
}
