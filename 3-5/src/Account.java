public class Account {
    int accountNumber;
    int balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
