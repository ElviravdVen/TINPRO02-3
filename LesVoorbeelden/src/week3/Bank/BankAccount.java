package week3.Bank;

interface BankAccount {
    void setAccountNumber(String an);
    double getBalance();
    void deposit(double amount);
    void printData();
}
