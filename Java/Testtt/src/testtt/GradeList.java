/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class GradeList extends ArrayList<Grade> {
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
            
            this.add(new Grade (stuList.get(studentPos),subList.get(subjectPos),lab, test, FE));
            System.out.println("Adding new grade: Done!");
        }
        
        public void printStudentReport() {
            String studentID;
            System.out.println("Enter student ID: ");
            Scanner sc = new Scanner (System.in);
            studentID = sc.nextLine();
            int gradePos = this.stuList.findIDStudent(studentID);
            if (gradePos==-1) System.out.println("No information for report!");
            
                System.out.println("Student ID: "+studentID);
                Student st =this.get(gradePos).getStu();
                System.out.println("Student name: "+st.getLastName()+ " " + st.getFirstName());
                System.out.println("| ++ No ++ | +++++++Subject name ++++++++ | ++ Average mark ++ | ++ Status ++ |");
                int count = 1;
                for (Grade g:this) {
                    if (g.getStu().getStudentID().equals(studentID)) {                       
                        double avg = g.average();
                        String status = avg>=5? "Pass\n" : "Fail\n";
                        //                 | ++ No ++ | +++++++Subject name ++++++++ | ++ Average mark ++ | ++ Status ++ |
                        System.out.format("|   %-4d   |        %-7s            |    %-7f            |     %-6s     |",
                                    count, g.sub.getSubjectName(), avg, status);
                        count++;
                    }
                }
            
        }
        
        public void printSubjectReport() {
            String subjectID;
            System.out.println("Enter subject ID: ");
            Scanner sc = new Scanner (System.in);
            subjectID=sc.nextLine();
            int gradePos = subList.findIDSubject(subjectID);
            if (gradePos==-1) System.out.println("No information to report!");           
                System.out.println("Subject ID: "+subjectID);
                Subject sub = this.get(gradePos).getSub();
                System.out.println("Subject name: "+this.get(gradePos).getSub().getSubjectName());
                System.out.println("| ++ No ++ | +++++++++ Student name +++++++++ | ++ Average mark ++ | ++ Status ++ |");
                int count =1;
                for (Grade g:this) {
                    if (subjectID.equalsIgnoreCase(g.getSub().getSubjectID())) {                        
                        double avg= g.average();
                        String status = avg>=5? "Pass\n" : "Fail\n";
                        //                 | ++ No ++ | ++++++++ Student name ++++++++ | ++ Average mark ++ | ++ Status ++ |
                        System.out.format("|    %-4d  | %-10s        |   %-7f         |   %-6s     |",
                                    count, g.getStu().getLastName()+" "+g.getStu().getFirstName(), avg, status);                      
                        count++;
                    }
                
            }
        }
}
