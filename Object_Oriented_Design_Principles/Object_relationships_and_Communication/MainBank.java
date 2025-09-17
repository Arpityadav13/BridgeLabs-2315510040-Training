class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialDeposit) {
        customer.deposit(initialDeposit);
        System.out.println(customer.name + " opened an account at " + bankName);
    }
}

class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("Alice");

        bank.openAccount(c1, 1000);
        c1.viewBalance();
    }
}
