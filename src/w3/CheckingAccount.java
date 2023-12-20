package w3;

public class CheckingAccount extends Account{
    CheckingAccount(int accountNumber, int SSN, String name, double balance) {
        super(accountNumber, SSN, name, balance);
    }

    public void withdraw(double amount){
        System.out.println("You are inside of checking account withdraw method");
    }
    public void withdraw(double amount, String str){
        System.out.println("You are inside of checking account withdraw method 1");
    }
}
