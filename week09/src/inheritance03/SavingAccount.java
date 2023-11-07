package inheritance03;

/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.*/
public class SavingAccount extends BankAccount {
    @Override
    public void withdraw(double amount){
        if ((balance >= 100)) {

            System.out.println("Withrawn: £ " + amount);
        }
        else {
            System.out.println("Withdrawal failed.");
        }

    }

    public static void main(String[] args) {
        SavingAccount m1 = new SavingAccount();
        m1.deposit(50);
        m1.withdraw(10000);
    }

}
