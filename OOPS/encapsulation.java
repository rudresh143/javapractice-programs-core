import java.util.*;
class Encapsulation{

    private String accountHolderName;
    private double balance;
    private long accountNumber;
    public static void main(String[] args){
        System.out.println("Enter you amount to deposite");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        Encapsulation account = new Encapsulation();
        account.deposite(amount);

        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Your balance is: " + account.getBalance());
    }


    // function for add balance 
    public void deposite(double amount){
        balance += amount;
    }

    // function for withdraw balance
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }else if(amount < 0){
            System.out.println("Invalid amount");
        }else{
            balance -= amount;
        }
    }

    // function for get balance
    public double getBalance(){
        return balance;
    }
}