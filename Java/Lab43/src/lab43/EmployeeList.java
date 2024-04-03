/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab43;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EmployeeList {
    ArrayList<Employee> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addSale() {
        String newCode, newName, newDOB;
        double newSale, newRate;
        
        System.out.println("Enter new code: ");
        newCode = sc.nextLine();
        System.out.println("Enter new name: ");
        newName = sc.nextLine();
        System.out.println("Enter new date of birth: ");
        newDOB= sc.nextLine();

        System.out.println("Enter sale: ");
        newSale = Double.parseDouble(sc.nextLine());
        System.out.println("Enter rate: ");
        newRate = Double.parseDouble(sc.nextLine());

        list.add(new Saleman(newCode, newName, newDOB, newSale, newRate));
    }

    public void addManager() {
        String newCode, newName, newDOB;
        int newLevel;
        
        System.out.println("Enter new code: ");
        newCode = sc.nextLine();
        System.out.println("Enter new name: ");
        newName = sc.nextLine();
        System.out.println("Enter new date of birth: ");
        newDOB= sc.nextLine();

        System.out.println("Enter level: ");
        newLevel = Integer.parseInt(sc.nextLine());

        list.add(new Manager(newCode, newName, newDOB, newLevel));
    }

    public void setBaseSalary() {
        double newBaseSalary;
        System.out.println("Enter new base salary: ");
        newBaseSalary = Double.parseDouble(sc.nextLine());
        Manager.setBaseSalary(newBaseSalary);
    }

    public void output() {
        if (list.isEmpty()) {
            System.out.println("Error: List is empty!");
            return;
        }
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
}
