import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 5000;
        while (true) {
            System.out.println("ATM Menu");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposite");
            System.out.println("4.Quit");
            System.out.println("Enter choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("your balance is " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    int withdrawAmount = scan.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("insufficient balance");

                    } else {
                        balance -= withdrawAmount;
                        System.out.println(("Withdrawal successful.your new balance is " + balance));

                    }
                    break;
                case 3:
                    System.out.println("Enter amout of deposit.");
                    int depositAmount = scan.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful. your new balance is " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using this ATM!");
                    System.exit(0);
                default:
                    System.out.println("invalid choice");

            }

        }
    }
}