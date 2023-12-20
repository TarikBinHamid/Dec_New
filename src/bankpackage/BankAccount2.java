package bankpackage;

public class BankAccount2 {
    private int accountNumber;
    private String name;
    private String phoneNumber;
    private String address;
    private double balance;

    public void setAccountNumber(int atNumber){
        accountNumber=atNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance1){
        if (balance1<0){
            System.out.println("You can not set a Negative Number");
        }else {
            balance=balance1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if (amount>1000){
            System.out.println("Your limit is $1000");
        }else {
            balance=balance-amount;
        }
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
}
