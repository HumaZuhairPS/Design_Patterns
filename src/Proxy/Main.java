package Proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        ATM atm = new ATM(bankAccount);
        System.out.println("Bank Account Balance: " + atm.getBalance());
    }
}
