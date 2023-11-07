package encapsulation12;
/*12. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/
public class BankAccount1 extends BankAccount {

    public static void main(String[] args) {
        BankAccount v = new BankAccount1();
        v.set_accountNumber(23456787);
        v.set_balance(20000);
        System.out.println("Account Number :- " + v.get_accountNumber());
        System.out.println("Balance :- " + v.get_balance());
    }
}
