/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SubjectList extends ArrayList<Subject> {

    public int find(String subID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getSubID().equalsIgnoreCase(subID)) {
                return i;
            }
        }
        return -1;
    }

    public void addSubject() {
        String subID, subName;
        int credit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("_______ & Add Subject Function & _______");

        do {
            System.out.print(" - Please input subject ID: ");
            subID = sc.nextLine().trim();
        } while (find(subID) >= 0 || subID.length() == 0);
        do {
            System.out.print(" - Please input subject name: ");
            subName = sc.nextLine();
            if (subName.length() == 0) {
                System.out.println(" Name does not contain number and blank");
            }
        } while (subName.length() == 0);

        try {

            do {
                System.out.print(" - Please input positive integer subject credit: ");
                credit = Integer.parseInt(sc.nextLine());
                if (credit < 0) {
                    System.out.println("--- Input invalid! ---");
                }
            } while (credit < 0);

            this.add(new Subject(subID, subName, credit));
            System.out.println("--- Subject has been added --- ");

        } catch (NumberFormatException e) {
            System.out.println("--- Please in integer credit! ---");
            System.out.println("--- Add subject fail! ---");
        }
    }

    public void removeSubject() {
        String subID;
        System.out.println("_______ & Delete Subject Function & _______");
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Please input subject ID for Delete: ");
        subID = sc.nextLine().trim();
        if (find(subID) < 0 || subID.length() == 0) {
            System.out.println("--- Subject is not existed! ---");
            System.out.println();
        } else {
            String decision;
            System.out.println("ID Subject is found !");
            System.out.print("Are you sure to delete this Subject ? (Y/N)");
            decision = sc.nextLine().toUpperCase();
            if (decision.matches("Y")) {
                this.remove(find(subID));
                System.out.println("--- Deleted Succesfully! ---");
                System.out.println();
            }
            if (decision.matches("N")) {
                System.out.println("--- The process of deleting was canceled! ---");
                System.out.println();
            }

        }
    }

    public void updateSuject() {
        String subID;
        String subName;
        int credit = 0;
        System.out.println("_______ & Update Subject Function & _______");
        Scanner sc = new Scanner(System.in);

        System.out.print(" - Please input subject ID for update: ");
        subID = sc.nextLine().trim();
        try {
            if (find(subID) < 0) {
                System.out.println("--- Subject does not existed! ---");

                if (subID.length() == 0) {
                    System.out.println("--- Student information does change! ---");
                }
            } else {
                System.out.print(" - Please input new subject name : ");
                subName = sc.nextLine();
                System.out.print(" - Please input new number of subject credit: ");
                try {
                    credit = Integer.parseInt(sc.nextLine());
                    if (subName.length() > 0) {
                        this.get(find(subID)).setSubName(subName);
                    }
                    if (credit > 0) {
                        this.get(find(subID)).setCredit(credit);
                    }

                    System.out.println("--- Update Successfully --- ");
                    System.out.println();
                } catch (NumberFormatException e) {

                } finally {
                    if (credit == 0) {
                        System.out.println("--- Credit does not change! ---");
                        System.out.println("--- Update successfully ---");
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }
}
