/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SubjectList extends ArrayList<Subject> implements I_SubjectList {
    //constructors
    public SubjectList(){
        super();
    }
    public SubjectList(int initCapacity){
        super(initCapacity);
    }
    //methods
    public int findIDSubject(String subjectID){
        for (int i=0; i<this.size(); i++){
        if (subjectID.matches(this.get(i).getSubjectID())==true)
            return i;
            }
        return -1;
    }
    @Override
    public void addSubject (){
        String subjectID,subjectName;
        int credit;
        do {
        System.out.println("Enter subject ID: ");
        Scanner sc = new Scanner(System.in);
        subjectID= sc.nextLine();
        } while (findIDSubject(subjectID)>0);
        do {
        System.out.println("Enter subject name: ");
        Scanner sc = new Scanner(System.in);
        subjectName= sc.nextLine();
        } while (subjectName==null);
        do {
        System.out.println("Enter number of credit: ");
        Scanner sc = new Scanner(System.in);
        credit = sc.nextInt();
        } while (credit < 0 || credit >30);
        System.out.println("Adding a new subject: Done");
        this.add(new Subject(subjectID,subjectName,credit));
    }
    
    @Override
    public void update() {
            String subjectName;
            String studentID,choice;
            int credit;
            System.out.println("Enter the student to update:");
		Scanner sc = new Scanner(System.in);
		studentID = sc.nextLine();
            int pos = findIDSubject(studentID);
            if (pos < 0) {
                System.out.println("Student does not exist!");
            }
            else {
                //do {
                System.out.println("1 - Update studnent");
                System.out.println("2 - Delete studnent");
                System.out.println("Your choice: ");
                choice = sc.nextLine();
                switch (choice) {
                case "1": {
                    System.out.println("Enter new subject name:");
                    subjectName = sc.nextLine();
                    System.out.println("Enter new number of credit:");
                    credit = sc.nextInt();
                    this.get(pos).setSubjectName(subjectName);
                    this.get(pos).setCredit(credit);
                    System.out.println("Updating subject: Done");
                    break;
                    }
                case "2": {
                    if (this.isEmpty()){
			System.out.println("Err: List empty!");
			return;
                    }
                    String decision;
                    System.out.println("Are you sure to delete this subject? Y/N");
                    decision = sc.nextLine();
                    if (decision.matches("Y")) {
                        this.remove(pos);
                        System.out.println("Done");
                    }
                    if (decision.matches("N")) {
                        System.out.println("The process of deleting was canceled!");
                    }
                    break;
                    }
                default: System.out.println("Invalid input");
                }
                }
                //while (!choice.matches("1") || !choice.matches("2"));
            //}
        }

}
