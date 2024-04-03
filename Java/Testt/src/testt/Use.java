/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Use
{
    public static void main(String argv[])
    {
      Scanner sc = new Scanner(System.in);
      I_Menu menu = new Menu();
      menu.addChoice("------------------------");
      menu.addChoice("1. Add new student");
      menu.addChoice("2. Update student");
      menu.addChoice("\t2.1 Update student");
      menu.addChoice("\t2.2 Delete student");
      menu.addChoice("3. Add new subject");
      menu.addChoice("4. Update subject");
      menu.addChoice("\t4.1 Update subject");
      menu.addChoice("\t4.2 Delete subject");
      menu.addChoice("5. Enter grade");
      menu.addChoice("6. Display student grade report");
      menu.addChoice("7. Display subject grade reprot");
      menu.addChoice("-------------------------");

      StudentList listStd = new StudentList();
      SubjectList listSub = new SubjectList();
      GradeList listGra = new GradeList(listStd, listSub);
      int choice;
      String decision = null;
      do {
        choice = menu.getChoice();
        switch(choice) {
          case 1: listStd.addStudent();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;   
          case 2: listStd.update();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          case 3: listSub.addSubject();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          case 4: listSub.update();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          case 5: listGra.addNewGrade();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          case 6: listGra.printStudentReport();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          case 7: listGra.printSubjectReport();
                  System.out.println("Do you want to go back to the main menu?");
                  decision = sc.nextLine();
                  break;
          default : System.out.println("Invalid input");
        }
      }while (decision.equalsIgnoreCase("Y") || decision.equalsIgnoreCase("Yes"));
        System.out.println("Program ending...");
    }
}
