package bankpackage;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount();
        bankAccount1.balance=-5000;
        bankAccount1.accountNumber=123;
        bankAccount1.phoneNumber="(676)-789-909";
        bankAccount1.name="Afreen";
        bankAccount1.deposit(500);
        System.out.println(bankAccount1.balance);
        bankAccount1.withdraw(1000);
        System.out.println(bankAccount1.balance);

        //********************************

        BankAccount2 bankAccount2= new BankAccount2();
        bankAccount2.setAccountNumber(456);
        System.out.println(bankAccount2.getAccountNumber());
        bankAccount2.setBalance(2000);
        bankAccount2.setPhoneNumber("(989)-567-325");
        System.out.println(bankAccount2.getBalance());
        bankAccount2.withdraw(1200);
        System.out.println(bankAccount2.getBalance());
        bankAccount2.withdraw(900);
        System.out.println(bankAccount2.getBalance());





    }
}
