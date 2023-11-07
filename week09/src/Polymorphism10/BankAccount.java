package Polymorphism10;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public class BankAccount {
    public void deposite(){
        System.out.println("Your Diposite is Sucessfull");
    }
    public void withdraw(int withdrawlimit,double withdrawfees){
        System.out.println("Withdraw Limit :- "+withdrawlimit);
        System.out.println("Wthdraw Fees :- "+withdrawfees+"%");

    }

    public static void main(String[] args) {
BankAccount v1 = new BankAccount();
v1.deposite();
v1.withdraw(1000,0.02);
    }
}
