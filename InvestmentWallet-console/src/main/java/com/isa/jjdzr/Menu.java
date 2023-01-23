package com.isa.jjdzr;

import java.util.Scanner;
import java.util.SortedMap;

public class Menu {
    public static void mainMenu() {
        boolean keepWorking = true;
        int menuOption = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome in INVESTMENT WALLET!!!");

        while (keepWorking) {
            clearConsole();
            showMenu();
            System.out.println("Pick number refering to menu option: ");
            try {
                menuOption = scan.nextInt();
                switch (menuOption) {
                    case 1: workInProgress(); break;
                    case 2: workInProgress(); break;
                    case 3: workInProgress(); break;
                    case 4: workInProgress(); break;
                    case 5: workInProgress(); break;
                    case 6: workInProgress(); break;
                    case 7: workInProgress(); break;
                    case 8: keepWorking = false; break;
                    default:
                        System.out.println("Wrong value, please try again.");
                }
            } catch (Exception e) {
                System.out.println("Wrong input, please try again");
                scan.next();
            }
        }
        System.out.println("Goodbye !!!");
        scan.close();
    }

    private static void workInProgress() {
        Scanner scan = new Scanner(System.in);
        clearConsole();
        System.out.println("Work in Progress. Press ENTER to continue.");

        scan.nextLine();
        }

    private static void showMenu() {

        System.out.println("\nUser: GUEST"); // do zmiany ma pokazywać wybranego uzytkownika
        System.out.println("\nMenu:");
        System.out.println("1. Create an account.");
        System.out.println("2. Choose/switch user.");
        System.out.println("3. Create a wallet.");
        System.out.println("4. Show your wallet.");
        System.out.println("5. Buy investments.");
        System.out.println("6. Sell investments.");
        System.out.println("7. Add founds.");
        System.out.println("8. Exit.");
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
