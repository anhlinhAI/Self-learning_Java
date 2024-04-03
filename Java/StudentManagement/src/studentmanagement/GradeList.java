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
public class GradeList extends ArrayList<Grade> {

    StudentList stList = new StudentList();
    SubjectList subList = new SubjectList();

    public int find(String stID, String subID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getSt().getstID().equalsIgnoreCase(stID) && this.get(i).getSub().getSubID().equalsIgnoreCase(subID)) {
                return i;
            }
        }
        return -1;
    }

    public GradeList(StudentList stList, SubjectList subList) {
        this.stList = stList;
        this.subList = subList;
    }

    private boolean isGrade(double num) {
        return (num > 0 && num <= 10);
    }

    public void addGrade() {
        String stID, subID;
        int stPos = -1, subPos = -1, gradePos = -1;
        double lab, test, FE;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Please input the student ID: ");
            stID = sc.nextLine().trim();
            stPos = stList.find(stID);
            System.out.print("Please input the subject ID: ");
            subID = sc.nextLine().trim();
            subPos = subList.find(subID);
            if (stPos < 0) {
                System.out.println("--- Student ID does not existed! ---");

            }
            if (subPos < 0) {
                System.out.println("--- Subject ID does not existed! ---");
                return;
            }
        } while (gradePos >= 0);
        gradePos = this.find(stID, subID);
        if (gradePos >= 0) {
            System.out.println(" --- Grade existed ! ---");
            System.out.println("Do you want overwrite it (Y/N) ?: ");
            String decision = sc.nextLine().toUpperCase().trim();
            if (decision.matches("Y")) {
                this.remove(gradePos);
            }
            if (decision.matches("N")) {
                System.out.println(" --- Input grade cancel ---");
                return;
            }

        }

        try {
            do {
                System.out.print("Please input lab grade: ");
                lab = Double.parseDouble(sc.nextLine());
                if (!isGrade(lab)) {
                    System.out.println("--- Grade invalid ---");
                }
            } while (!isGrade(lab));

            do {
                System.out.print("Please input test grade: ");
                test = Double.parseDouble(sc.nextLine());
                if (!isGrade(test)) {
                    System.out.println("--- Grade invalid ---");
                }
            } while (!isGrade(test));

            do {
                System.out.print("Please input FE grade: ");
                FE = Double.parseDouble(sc.nextLine());
                if (!isGrade(FE)) {
                    System.out.println("--- Grade invalid ---");
                }
            } while (!isGrade(FE));
            this.add(new Grade(stList.get(stPos), subList.get(subPos), lab, test, FE));
            stList.get(stPos).canDelete = false;
            subList.get(stPos).canDelete = false;
            System.out.println("--- A new grade have been added ---");
        } catch (NumberFormatException e) {
            System.out.println(" Please input grade (0 < grade <= 11)");
            System.out.println("---- Added grade fail! ----");
        }
    }

    public void printSubjectReport() {
        String subID;
        System.out.println("------ Print subject report function ------");
        System.out.println();
        System.out.print("- Please input subject ID: ");
        Scanner sc = new Scanner(System.in);
        subID = sc.nextLine().trim();
        int gradePos = subList.find(subID);
        try {
            if (gradePos < 0) {
                System.out.println("--- No information to report! ---");
                System.out.println();
            }
            System.out.println("Subject ID: " + subID);
            System.out.println("Subject name: " + this.get(gradePos).getSub().getSubName());
            System.out.println("List of subject sort by Subject Name:");
            System.out.println("| ++ No ++ |  ++++++++++ Student name ++++++++++  | ++ Average mark ++ |      ++ Status ++      |");
            int count = 1;
            for (Grade g : this) {
                if (subID.equalsIgnoreCase(g.getSub().getSubID())) {
                    double avg = g.average();
                    String status = avg >= 5 ? " Pass " : " Fail ";
                    System.out.format("     %-4d                %-10s                    %1.1f                   %-6s          ",
                            count, g.getSt().getLastName() + " " + g.getSt().getFirstName(), avg, status);
                    System.out.println();
                    count++;
                    System.out.println();
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

    public void printStudentReport() {
        String stID;
        int gradePos;
        //do {
        System.out.println("------ Print student report function ------");
        System.out.println();
        System.out.print("- Please input student ID: ");
        Scanner sc = new Scanner(System.in);
        stID = sc.nextLine().trim();
        gradePos = this.stList.find(stID);
        try {
            if (gradePos < 0) {
                System.out.println("--- No information to report! ---");
                System.out.println();
            }
            System.out.println("Student ID: " + stID);
            System.out.println("Student name: " + this.get(gradePos).getSt().getLastName() + " " + this.get(gradePos).getSt().getFirstName());
            System.out.println("List of student sort by Subject Name:");
            System.out.println("| ++ No ++ |  ++++++++++ Subject name ++++++++++  |   ++ Average mark ++   |      ++ Status ++      |");
            int count = 1;
            for (Grade g : this) {
                if (stID.equalsIgnoreCase(g.getSt().getstID())) {
                    double avg = g.average();
                    String status = avg >= 5 ? " Pass " : " Fail ";
                    System.out.format("     %-4d                %-10s                       %1.1f                      %-6s          ",
                            count, g.getSub().getSubName(), avg, status);
                    System.out.println();
                    count++;
                    System.out.println();
                }
            }

        } catch (IndexOutOfBoundsException e) {

        }
    }
}
