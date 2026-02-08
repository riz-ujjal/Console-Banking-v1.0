import java.util.Scanner;
class BankAccount
{
    String accountHolderName;
    String accountNumber;
    double balance;

    // Created a Method here.
    void deposit(double amount)
    {
        balance = balance +amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }
        else{
            System.out.println("Insufficient Balance\n");
        }
    }

    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount myAcc = new BankAccount(); //create a new bank account object based on the blueprint above
        System.out.println("Enter your name: ");
        myAcc.accountHolderName = sc.nextLine();
        myAcc.balance = 0.0;
        double deposited;
        double withdrawed;


        // Performing the task user wants to
        while (true) {
            System.out.println("""
                    press 1 to Deposit.
                    press 2 to Withdraw.
                    press 3 to Check Bank Balance
                    press 4 to Exit.
                    What do you want to perform:""");
            int user_input = sc.nextInt();
            if (user_input == 1) {
                System.out.println("Amount to Deposit: ");
                deposited = sc.nextDouble();
                myAcc.deposit(deposited);
            }
            else if (user_input == 2) {
                System.out.println("Amount to Withdraw: ");
                withdrawed = sc.nextDouble();
                myAcc.withdraw(withdrawed);

            } else if (user_input == 3) {
                myAcc.displayBalance();

            } else if (user_input == 4) {
                System.out.println("Exited");
                break;
            }
            else{
                System.out.println("Enter the valid task");
            }
        }
    }
}