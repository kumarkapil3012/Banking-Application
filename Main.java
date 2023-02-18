import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int balance = 100000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("ATM Machine");
            System.out.println("Choose 1 : For Withdraw");
            System.out.println("Choose 2 : For Deposit");
            System.out.println("Choose 3 : For Check Balance");
            System.out.println("Choose 4 : For Exit");
            System.out.print("Choose the operation you want to perform from above: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to br withdrawn: ");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficiant Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

            }

        }

    }

}