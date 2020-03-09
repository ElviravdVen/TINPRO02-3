package week3.Bank;

public class SavingsAccount extends Account{

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

}
