package inheritance03;

/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.*/
public class BankAccount {
    double balance;
    public void deposit(double amount) {
        balance = 0;
        balance += amount;
        System.out.println("Deposit : £ " + amount);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("Withdrawn: £ " + amount);
        } else {
            System.out.println("Withrawal failed");
        }

    }
    public static void main(String[] args) {
BankAccount x1 = new BankAccount();
x1.withdraw(5000);
x1.deposit(4000);
    }
}
