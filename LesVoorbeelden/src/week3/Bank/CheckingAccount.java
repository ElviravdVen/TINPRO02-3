package week3.Bank;

public class CheckingAccount extends Account {
    public CheckingAccount() {
        this.balance = 500;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance - amount;
    }
}
