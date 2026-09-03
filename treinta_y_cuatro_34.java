public class treinta_y_cuatro_34 {
    private double balance;

    Q34_BankAccount(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid: balance cannot be negative.");
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Q34_BankAccount acc = new Q34_BankAccount(1000);
        System.out.println("Initial balance: " + acc.getBalance());

        acc.setBalance(-500);
        System.out.println("Balance after invalid set: " + acc.getBalance());

        acc.setBalance(2500);
        System.out.println("Balance after valid set: " + acc.getBalance());
    }
}
