package Proxy;

public class ATM { //proxy
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public double getBalance() {
        System.out.println("Accessing bank account balance through ATM...");
        return account.getBalance();
    }
}
