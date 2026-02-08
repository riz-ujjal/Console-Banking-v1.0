import java.util.Scanner;
class BankAccount
{
    String accountHolderName;
    String accountNumber;
    double balance;

    void deposit(double amount)
    {

        balance = balance +amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }

    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main
{

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        BankAccount myAcc = new BankAccount(); //create a new bank account object based on the blue print above
        System.out.println("Enter your name: ");
        myAcc.accountHolderName = sc.nextLine();
        myAcc.balance =0.0;
        //take the value from the user to deposit and withdraw.
        System.out.println("Enter the money you want to Deposit: ");
        double deposited = sc.nextDouble();
        System.out.println("Enter the money you want to Withdraw+: ");
        double withdrawed = sc.nextDouble();
        myAcc.deposit(deposited);
        myAcc.withdraw(withdrawed);
        myAcc.displayBalance();


    }
}

