/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MainMenu {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.addItem("---------------------------");
        menu.addItem("1- Create user account");
        menu.addItem("2- Check exist user");
        menu.addItem("3- Search user information by name");
        menu.addItem("4- Update user");
        menu.addItem("    4.1- Update user");
        menu.addItem("    4.2- Delete user");
        menu.addItem("5- Save account to file");
        menu.addItem("6- Print list user form file");
        menu.addItem("Other - Quit");
        menu.addItem("---------------------------");
        menu.addItem("Please choice :");
        int choice;
        UserList uList = new UserList();
        String decision;
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    do {
                        uList.createAccount();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        uList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 2:
                    do {
                        
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        uList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 3:
                    do {
                        uList.searchAccount();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        uList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 4:
                    int choice3 = 0;
                    try {
                        System.out.println("1- Update user");
                        System.out.println("2- Delete user");
                        System.out.println("3- Back to menu");
                        choice3 = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Input incorrect!");
                    }
                    switch (choice3) {
                        case 1:
                            do {
                                System.out.println("---Update user ---");
                                uList.updateUser();
                                System.out.println("Do you want to go back to the menu ?");
                                System.out.println("Please enter 'Y' to go back or 'N' to continue");
                                decision = sc.nextLine().toUpperCase();
                                uList.checkContinue(decision);
                            } while (decision.matches("N"));
                            break;
                        case 2:
                            do {
                                System.out.println("--- Delete user ---");
                                uList.removeAccount();
                                System.out.println("Do you want to go back to the menu ?");
                                System.out.println("Please enter 'Y' to go back or 'N' to continue");
                                decision = sc.nextLine().toUpperCase();
                                uList.checkContinue(decision);
                            } while (decision.matches("N"));
                            break;
                        case 3:
                            System.out.println("Please enter for back to menu: ");
                            decision = sc.nextLine();
                            break;

                    }
                    break;

                case 5:
                    do {
                        uList.writeFile();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        uList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 6:
                    do {
                        uList.printFile();

                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        uList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;

            }
        } while (choice >= 0 && choice <= 6);
    }
}
