package src;

import java.util.Scanner;

public class Account {
    static Scanner sc = new Scanner(System.in);
    private static int checkingAccountBalance = 0;
    private static int savingsAccountBalance = 0;

    private static int getCheckingAccountBalance() {
        System.out.print("Your Account Balance is: Rs.");
        return checkingAccountBalance;
    }

    private static int getSavingsAccountBalance() {
        System.out.print("Your Account Balance is: Rs.");
        return savingsAccountBalance;
    }

    private static void withdrawSavingsAccount(int amount) {
        if (savingsAccountBalance > amount) {
            savingsAccountBalance -= amount;
            System.out.println("Savings Account Balance is: Rs." + savingsAccountBalance);
        } else {
            System.out.println("Savings Account Balance Insufficient.");
        }
    }

    private static void withdrawCheckingAccount(int amount) {
        if (checkingAccountBalance > amount) {
            checkingAccountBalance -= amount;
            System.out.println("Account Balance is: Rs." + checkingAccountBalance);
        } else {
            System.out.println("Account Balance Insufficient.");
        }
    }

    private static void depositCheckingAccount(int amount) {
        if (amount > 0) {
            checkingAccountBalance += amount;
            System.out.println("Account Balance is: Rs." + checkingAccountBalance);
        } else {
            System.out.println("Enter valid amount.");
        }
    }

    private static void depositSavingsAccount(int depositAmount) {
        if (depositAmount > 0) {
            savingsAccountBalance += depositAmount;
            System.out.println("Account Balance is: Rs." + savingsAccountBalance);
        } else {
            System.out.println("Enter valid amount.");
        }
    }

    private static void printCheckingStatement() {
        System.out.println();
        System.out.println("Checking Account:");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
    }

    private static void printSavingsStatement() {
        System.out.println();
        System.out.println("Savings Account:");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
    }

    public static void checkingAccount() {
        printCheckingStatement();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println(getCheckingAccountBalance());
                checkingAccount();
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                int amount = sc.nextInt();
                withdrawCheckingAccount(amount);
                checkingAccount();
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = sc.nextInt();
                depositCheckingAccount(depositAmount);
                checkingAccount();
                break;
            case 4:
                System.out.println("Exiting ATM System. \nBYE!");
                return;
            default:
                System.out.println("Enter a valid choice.");
                checkingAccount();
                break;
        }
    }

    public static void savingsAccount() {
        printSavingsStatement();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println(getSavingsAccountBalance());
                savingsAccount();
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                int amount = sc.nextInt();
                withdrawSavingsAccount(amount);
                savingsAccount();
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = sc.nextInt();
                depositSavingsAccount(depositAmount);
                savingsAccount();
                break;
            case 4:
                System.out.println("Exiting ATM System. \nBYE!");
                return;
            default:
                System.out.println("Enter a valid choice.");
                savingsAccount();
                break;
        }
    }

}
