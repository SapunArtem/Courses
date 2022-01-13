package Course1.Lessons.Lesson4;

public class BankAccount {
    int id ;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();

        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Artem";
        MyAccount.balance = 15.15;

        YourAccount.id = 2;
        YourAccount.name = "Andrey";
        YourAccount.balance = 20.20;

        HisAccount.id = 3;
        HisAccount.name = "Kirill";
        HisAccount.balance = 30.30;


    }
}
