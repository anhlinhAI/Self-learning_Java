/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab43;

/**
 *
 * @author PC
 */
public class ManagingProgram {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int choice;
        EmployeeList list = new EmployeeList();

        menu.add("Add a saleman.");
        menu.add("Add a manager.");
        menu.add("Change base salary.");
        menu.add("Print out list.");
        menu.add("Exit");

        do {
            System.out.println("EMPLOYEE MANAGER");
            choice = menu.getChoice();
            switch(choice) {
                case 1: list.addSale(); break;
                case 2: list.addManager(); break;
                case 3: list.setBaseSalary(); break;
                case 4: list.output(); break;
            }            
        } while (choice>=1&&choice<=4);

    }
    
}
