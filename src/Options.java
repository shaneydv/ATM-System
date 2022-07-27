package src;

import java.util.HashMap;
import java.util.Scanner;

public class Options extends Account {
    private static final HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    static Scanner sc = new Scanner(System.in);

    public static void getOptions() {

        try {
            setUserDetails();
            System.out.println("Welcome to the ATM System!");
            System.out.print("Enter your customer number: ");
            int username = Integer.parseInt(String.valueOf(sc.nextInt()));
            System.out.print("Enter your PIN number: ");
            int password = Integer.parseInt(String.valueOf(sc.nextInt()));
            if (validateDetails(username, password)) {
                showChoices();
            }
        }

        catch (Exception e) {
            System.out.println("Only number allowed.");
        }
    }

    public static void setUserDetails() {
        data.put(65442, 2512);
        data.put(96374, 8256);
    }

    public static boolean validateDetails(int username, int password) {
        try {
            if (data.containsKey(username)) {
                int pwd = data.get(username);
                if (pwd == password)
                    return true;
                else
                    System.out.println("Incorrect password!!!");
            } else
                System.out.println("Please enter the correct username!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static void showChoices() {
        System.out.println();
        System.out.println("Hello User!");
        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1 for Checking Account");
        System.out.println("Type 2 for Savings Account");
        System.out.println("Type 3 to Exit");
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                checkingAccount();
                break;
            case 2:
                savingsAccount();
                break;
            case 3:
                System.out.println("Exiting the ATM System.");
                break;
            default:
                System.out.println("Please enter the correct choice.");
                showChoices();
        }
    }
}
