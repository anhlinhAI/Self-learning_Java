/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MainMenu {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.addItem("---------------------------");
        menu.addItem("1- Add new student");
        menu.addItem("2- Update Student");
        menu.addItem("    2.1- Delete Student");
        menu.addItem("    2.2- Update Student");
        menu.addItem("3- Add new Subject");
        menu.addItem("4- Update Subject");
        menu.addItem("    4.1- Delete Subject");
        menu.addItem("    4.2- Update Subject");
        menu.addItem("5- Enter Grade");
        menu.addItem("6- Display Student Grade Report");
        menu.addItem("7- Display Subject Grade Report");
        menu.addItem("Other - Quit");
        menu.addItem("---------------------------");
        menu.addItem("Please choice :");
        int choice;
        StudentList stList = new StudentList();
        SubjectList subList = new SubjectList();
        GradeList gradeList = new GradeList(stList, subList);
        String decision;
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    do {
                        stList.addStudent();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        stList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 2:
                    System.out.println("1- Delete Student");
                    System.out.println("2- Update Student");
                    System.out.println("3- Back to menu");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    switch (choice2) {
                        case 1:
                            do {
                                System.out.println("--- Delete Student ---");
                                stList.removeStudent();
                                System.out.println("Do you want to go back to the menu ?");
                                System.out.println("Input 'Y' for go back or 'N' for continue this function ! ");
                                decision = sc.nextLine().toUpperCase();
                                stList.checkContinue(decision);
                            } while (decision.matches("N"));

                            break;
                        case 2:
                            do {
                                System.out.println("--- Update Student ---");
                                stList.updateStudent();
                                System.out.println("Do you want to go back to the menu ? ");
                                System.out.println("Please enter 'Y' to go back or 'N' to continue");
                                decision = sc.nextLine().toUpperCase();
                                stList.checkContinue(decision);
                            } while (decision.matches("N"));
                            break;
                        case 3:
                            System.out.println("Please enter for back to menu: ");
                            decision = sc.nextLine();
                            break;
                    }
                    break;
                case 3:
                    do {
                        subList.addSubject();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        stList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 4:
                    System.out.println("1- Delete Subject");
                    System.out.println("2- Update Subject");
                    System.out.println("3- Back to menu");
                    int choice3 = Integer.parseInt(sc.nextLine());
                    switch (choice3) {
                        case 1:
                            do {
                                System.out.println("--- Delete Subject ---");
                                subList.removeSubject();
                                System.out.println("Do you want to go back to the menu ?");
                                System.out.println("Please enter 'Y' to go back or 'N' to continue");
                                decision = sc.nextLine().toUpperCase();
                                stList.checkContinue(decision);
                            } while (decision.matches("N"));
                            break;
                        case 2:
                            do {
                                System.out.println("--- Updated Subject ---");
                                subList.updateSuject();
                                System.out.println("Do you want to go back to the menu ?");
                                System.out.println("Please enter 'Y' to go back or 'N' to continue");
                                decision = sc.nextLine().toUpperCase();
                                stList.checkContinue(decision);
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
                        gradeList.addGrade();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        stList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 6:
                    do {
                        gradeList.printStudentReport();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        stList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;
                case 7:
                    do {
                        gradeList.printSubjectReport();
                        System.out.println("Do you want to go back to the menu ?");
                        System.out.println("Please enter 'Y' to go back or 'N' to continue");
                        decision = sc.nextLine().toUpperCase();
                        stList.checkContinue(decision);
                    } while (decision.matches("N"));
                    break;

            }

        } while (choice >= 0 && choice <= 7);
    }
}
