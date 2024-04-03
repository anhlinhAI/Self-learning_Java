/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StudentMng1 {
     public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new student");
        menu.add("Update student");
        menu.add("Delete student");
        menu.add("Print student list");
        menu.add("Others- Quit");
        StudentList list = new StudentList();
        int choice = 0;
        do {
            choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    list.addNewStd();
                    break;
                case 2:
                    list.updateStudent();
                    break;
                case 3:
                    list.removeStudent();
                    break;
                case 4:
                    list.output();
                    break;
            }
        } while (choice > 0 && choice < 5);
    }   
}
