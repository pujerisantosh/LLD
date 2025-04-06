package oppsLLD.introOOP.task;

public class Cleint {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.balance = 100000000;
        account.deposit(100000);
        account.withDraw(5000);




    }
}
