package Polymorphism10;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(int withdrawlimit, double withdrawfees) {
        System.out.println("If coustermer has Checking account : ");
        System.out.println("Withdraw Limit :- "+withdrawlimit);
        System.out.println("Wthdraw Fees :- "+withdrawfees+"%");
    }

    public static void main(String[] args) {
        CheckingAccount m1 = new CheckingAccount();
        m1.withdraw(1500,0.05);
    }
}
