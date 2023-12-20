package w3;

public class Account {

    private int accountNumber;
    private String name;
    private int SSN;
    private String phoneNumber;
    private String address;
    private double balance;

    Account(int accountNumber,int SSN, String name, double balance){
        this.accountNumber=accountNumber;
        this.SSN=SSN;
        this.name=name;
        this.balance=balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
        }
    }
    public void withdraw(double amount){
        if ((balance-amount)>=0)
            balance=balance-amount;
    }

}
