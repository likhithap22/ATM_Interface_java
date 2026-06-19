import java.util.Scanner;
class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance+=amount;
            System.out.println("$" +amount +" deposited successfully");
        }
        else
        {
            System.out.println("Invalid deposit");
        }
    }
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid withdraw");
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient balance amount");
        }
        else{
            balance-=amount;
            System.out.println("$" +amount +" withdrawed successfully");
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
 class ATM{
    private BankAccount account;
    Scanner sc = new Scanner(System.in);
    public ATM(BankAccount account)
    {
        this.account = account;
    }

public void display(){
    int choice;
    do{
        System.out.println("------ATM BANKING SYSTEM-----");
            System.out.println("1. Balance ammount");
            System.out.println("2. Enter amount to deposit");
            System.out.println("3. Enter amount to  withdraw");
            System.out.println("4. Exit");
            System.out.println("enter choice to continue : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("$"+account.getBalance());
                    break;
                    case 2:
                        System.out.println("Enter amount to deposit");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                        break;
                        case 3:
                            System.out.println("Enter amount to withdraw");
                            double withdraw = sc.nextDouble();
                            account.withdraw(withdraw);
                            break;
                            case 4:
                                System.out.println("Thank you Visit Again");
                                break;
                                default :
                                System.out.println("Invalid choice");
            }
         } while(choice!=4);
        }
    }

    public class ATMInterface
    {
        public static void main(String[] args) {
            BankAccount userAccount = new BankAccount(1000000);
            ATM acc = new ATM(userAccount);
            acc.display();

        }
    }
