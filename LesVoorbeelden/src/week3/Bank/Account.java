package week3.Bank;

public abstract class Account implements BankAccount{
    private String accountNumber;
    protected double balance;
    private String accountType;

    @Override
    public void setAccountNumber(String an) {
        this.accountNumber = an;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void printData(){
        System.out.println("This is a  " + this.accountType);
        System.out.println("Account number is: " + this.accountNumber);
        System.out.println("Balance is: " + this.balance);
    }
}
