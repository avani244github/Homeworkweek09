package encapsulation12;
/*12. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/
public class BankAccount {
    private int accountNumber;
    private int balance;
    public int get_accountNumber(){
        return accountNumber;
    }
    public void set_accountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int get_balance(){
        return balance;
    }
    public void set_balance(int balance){
        this.balance=balance;
    }

}
