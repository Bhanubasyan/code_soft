import java.util.*;
import java.util.Scanner;


// ATM CLASS..... 

class ATM {
    public static void main(String[] args) {
        int balance = 10000;

        //  INPUT

        Scanner r = new Scanner(System.in);
        System.out.println("\n\n Hello Dear customer welcome in SBI bank\n");
        while (true) {

            //  TAKE CUSTOMER INORMATION ( ID , PASSWORD)

            System.out.println("\n Please enter your customer id ");
            int user_id = r.nextInt();
            System.out.println(" please enter your password ");
            int password = r.nextInt();
            if (user_id == 75006593) {
                System.out.println(" ");
            } else {
                System.out.println(" invalid userid ,please enter a valid userid");
            }

            if (password == 2345) {
                System.out.println(" Login successfull !");
            } else {
                System.out.println(" Incorrect username or password");
            }
//  OPPRATION BY CUSTOMER....

            System.out.println(" - Select the operation you want to perform:");
            System.out.println(" \n- Select 1 for chek Bank Balance:");
            System.out.println(" \n- Select 2 for Deposot :");
            System.out.println(" \n- Select 3 for withdrawl:");
            int choice = r.nextInt();
            switch (choice) {
//  CHEK BANK BALANCE.....

                case 1:
                    System.out.println("  your current Balance is" + balance);
                    break;
// AMOUNT DEPOSIT.....

                case 2:
                    System.out.println(" Enter the Amount you want to deposit \n");
                    int deposit = r.nextInt();
                    balance = balance + deposit;
                    System.out.println(" YOUR Money has been succesfully deposited");
                    System.out.println(" Now your bank balance is " + balance);

                    break;
//  WITHDRAW AMOUNT
                case 3:
                    System.out.println(" enetr the amount you want to withdraw");
                    int withdraw = r.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("withdrwal sucessfully, plz collect you money");
                        System.out.println("\n Now your balance is " + balance);

                    } else {
                        System.out.println("Insufficient Balance");
                    }

            }
        }
    }
}