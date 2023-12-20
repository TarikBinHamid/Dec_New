package w3;

public class TestAccount {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount(12342,655, "Tarik",2500);
        savingAccount.deposit(400);
        System.out.println(savingAccount.getBalance());

        CheckingAccount checkingAccount=new CheckingAccount(90945,8578,"Afreen",1500);
//        checkingAccount.withdraw(900);
//        checkingAccount.withdraw(800);
//        System.out.println(checkingAccount.getBalance());

        checkingAccount.withdraw(100);
        checkingAccount.withdraw(200,"ABC");

        Account account=new Account(555,663,"Afra",2000);
        Account account1=new SavingAccount(333,659,"Rimi", 6000);

    }
}
