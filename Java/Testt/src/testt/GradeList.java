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
public class GradeList extends ArrayList<Grade> implements I_GradeList{
        StudentList stuList = new StudentList();
        SubjectList subList = new SubjectList();

//constructors
	public GradeList(int initialCapacity) {
		super(initialCapacity);
	}
	public GradeList(StudentList stuList, SubjectList subList) {
            this.stuList = stuList;
            this.subList = subList;
	}
	//methods
        public int search (int studentPos, int subjectPos){
            if (studentPos>=0 && subjectPos>=0)
                return 1;
            return -1;
        }
        
        @Override
        public void addNewGrade (){
            String studentID = null, subjectID = null;
            double lab,test,FE;
            int studentPos=-1, subjectPos=-1, gradePos=-1;
            do {
                do {
                    System.out.println("Enter the student ID: ");
                    Scanner sc = new Scanner (System.in);
                    studentID = sc.nextLine();
                    studentPos = stuList.findIDStudent(studentID);
                } while (studentPos<0);
                do {
                    System.out.println("Enter the subject ID: ");
                    Scanner sc = new Scanner (System.in);
                    subjectID = sc.nextLine();
                    subjectPos = subList.findIDSubject(subjectID);
                } while (subjectPos<0);
                gradePos = this.search(studentPos, subjectPos);
                if (gradePos>0) System.out.println("This grade existed!");
            } while (gradePos<0);
            do {
            System.out.println("Enter lab score: ");
            Scanner sc = new Scanner(System.in);
            lab = sc.nextDouble();
            } while (lab>10 || lab<0);
            
            do {
            System.out.println("Enter test score: ");
            Scanner sc = new Scanner(System.in);
            test = sc.nextDouble();
            } while (test>10 || test<0);
            
            do {
            System.out.println("Enter FE score: ");
            Scanner sc = new Scanner(System.in);
            FE = sc.nextDouble();
            } while (FE>10 || FE<0);
            
           // this.add(new Grade (stuList.get(studentPos),subList.get(subjectPos),lab, test, FE));
            this.add(new Grade ( stuList.get(studentPos), subList.get(subjectPos),lab, test, FE));
            //stdList.get(studentPos).canDelete = false;
            //subList.get(subjectPos).canDelete = false;
            System.out.println("Add new grade: Done!");
        }
        
        @Override
        public void printStudentReport() {
            String studentID = null;
            System.out.println("Enter student ID: ");
            Scanner sc = new Scanner (System.in);
            studentID = sc.nextLine();
            int gradePos = stuList.findIDStudent (studentID);
            if (gradePos<0) System.out.println("No information for report!");
            else {
                System.out.println("Student ID: "+studentID);
                Student st =this.get(gradePos).stu;
                System.out.println("Student name: "+st.lastName+" "+st.firstName);
                System.out.println("---No---+----Subject----+----Average-----+----+Status------");
                int count =1;
                for (Grade g:this) {
                    if (studentID.equalsIgnoreCase(g.stu.studentID)) {
                        System.out.print(count);
                        System.out.print(g.sub.subjectName);
                        double avg= g.average();
                        System.out.print(avg);
                        if (avg>=5) System.out.print("Pass"); 
                        else System.out.print("Fail");
                        count++;
                    }
                }
            }
        }
        
        @Override
        public void printSubjectReport() {
            String subjectID;
            System.out.println("Enter subject ID: ");
            Scanner sc = new Scanner (System.in);
            subjectID=sc.nextLine();
            int gradePos = stuList.findIDStudent(subjectID);
            if (gradePos<0) System.out.println("No information to report!");
            else {
                System.out.println("Student ID: "+subjectID);
                Subject sub = this.get(gradePos).sub;
                System.out.println("Student name: "+sub.subjectName);
                System.out.println("---No---+----Student ID----+----Student Name----------+----+Status------");
                int count =1;
                for (Grade g:this) {
                    if (subjectID.equalsIgnoreCase(g.sub.subjectID)) {
                        System.out.print(count);
                        System.out.print(g.stu.studentID);
                        System.out.print(g.stu.firstName);
                        System.out.print(g.stu.lastName);
                        double avg= g.average();
                        if (avg>=5) System.out.print("Pass"); 
                        else System.out.print("Fail");
                        count++;
                    }
                }
            }
        }
}

