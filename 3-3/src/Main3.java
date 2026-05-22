public class Main3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.getBalance();
        
        myAccount.deposit(10000);
        myAccount.withdraw(3000);
        myAccount.withdraw(8000);
    }
}
