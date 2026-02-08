import java.util.Scanner;
class BakAccount
    {
    String accountHolderName;
    String accountNumber;
    double balance;

    void deposit(double amount)
    {

        balance = balance +amount;
        System.out.println("Deposited: " + amount);
    }
}
public class looppss {
    static void main(String[] args){
        BakAccount myAc = new BakAccount();
        Scanner sc = new Scanner(System.in) ;
        myAc.balance =0.0;
        //take the value from the user to deposit and withdraw.
//        System.out.println("Enter the money you want to Deposit: ");
        double deposited;

        while (true) {
            System.out.println("""
                    press 1 to Deposit.
                    press 2 to Withdraw.
                    press 3 to Check Bank Balance
                    press 4 to Exit.
                    What do you want to perform:""");
            int user_input = sc.nextInt();
            if (user_input == 1) {
                System.out.println("Enter the money you want to Deposit: ");
                deposited = sc.nextDouble();
                myAc.deposit(deposited);
                break;
            }
            if (user_input == 2){

            }
        }
        //take the value from the user to deposit and withdraw.


    }
}
