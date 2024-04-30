package Banking;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int money = 0;
    static Scanner in = new Scanner(System.in);
    private static int[] credentials = {123456,1234};
    static boolean running = false;

    public static void main(String[] args) {
        loginPage();
        while (running){
            mainMenu();
            out.print("\nEnter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> out.print("");
                case 4 -> {
                    out.println("Thank you for using our services! We'll see you soon!");
                    running = false;
                }
                default -> {
                    out.println("Invalid Option. Try Again!");
                    //throw new IllegalStateException("Unexpected value: " + choice);
                }
            }
            if(running){
                out.println("Current Balance: " + money);
                in.nextLine(); //Press any key to continue
                out.print("\nPress Enter to continue..\n");
                in.nextLine();
            }

        }
    }

    static void mainMenu(){
        out.println("*".repeat(30));
        out.println(" ".repeat(12) + "Welcome");
        out.println("*".repeat(30));

        out.println("1.Deposit Money");
        out.println("2.Withdraw Money");
        out.println("3.Check Balance");
        out.println("4.Exit");
    }
    static void loginPage(){
        out.println(" ".repeat(12) +"LOGIN PAGE");
        out.print("Enter your Customer ID: ");
        int CustomerID = in.nextInt();
        out.print("Enter your 4 Digit PIN: ");
        int PIN = in.nextInt();
        out.print("Press Enter to confirm...");
        in.nextLine(); //Press any key to continue
        in.nextLine();
        out.println("\nVerifying Credentials...");
        credentialsValidation(CustomerID, PIN);
    }
    static void deposit(){
        out.print("Enter the amount to deposit: ");
        int addAmount = in.nextInt();
        money += addAmount;
        out.println("\nRs." + addAmount + " added successfully!");
    }
    static void withdraw() {
        out.print("Enter the amount to withdraw: ");
        int reduceAmount = in.nextInt();
        money -= reduceAmount;
        out.println("\nRs." + reduceAmount + " withdrawn successfully!");
    }
    static void credentialsValidation(int CustomerID, int PIN){
        if (CustomerID == credentials[0] && PIN == credentials[1]){
            out.println("VALID CREDENTIALS! Logging you in...\n");
            running = true;
        }else{
            out.println("INVALID CREDENTIALS. Try Again :/\n");
            loginPage();
        }
    }
}

