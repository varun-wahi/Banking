package Banking;

import java.util.Scanner;

public class Main {
    private static int o = 10;
    public static int money = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running){
            mainMenu();
            System.out.print("\nEnter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the amount to deposit: ");
                    int addAmount = in.nextInt();
                    money += addAmount;
                    System.out.println("\nRs." + addAmount + " added successfully!");
                    System.out.println("Current Balance: " + money);
                }
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    int reduceAmount = in.nextInt();
                    money -= reduceAmount;
                    System.out.println("\nRs." + reduceAmount + " withdrawn successfully!");
                    System.out.println("Current Balance: " + money);
                }
                case 3 -> System.out.println("\nCurrent Balance: " + money);
                case 4 -> {
                    System.out.println("Thank you for using our services! We'll see you soon!");
                    running = false;
                }
                default -> {
                    System.out.println("Invalid Option. Try Again!");
                    //throw new IllegalStateException("Unexpected value: " + choice);
                }
            }
        }


    }
    static void mainMenu(){
        System.out.println("\n" + "*".repeat(30));
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

}

