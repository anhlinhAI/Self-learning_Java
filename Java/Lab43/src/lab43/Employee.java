/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab43;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Employee {
    private String code, name, dob;
    Scanner sc = new Scanner(System.in);


    public Employee() {
    }

    public Employee(String code, String name, String dob) {
        this.code = code;
        this.name = name;
        if (this.isDOB(dob))
            this.dob = dob;
        else {
            do {
                System.out.println("Error: Invalid DOB!");
                System.out.println("Enter DOB again: ");
                dob = sc.nextLine();
            }
            while (!this.isDOB(dob));
            this.dob = dob;
        }
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return this.dob;
        
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void input() {
        System.out.println("Enter code: ");
        this.code= sc.nextLine();
        System.out.println("Enter name: ");
        this.name= sc.nextLine();
        System.out.println("Enter date of birth: ");
        this.dob= sc.nextLine();
    }

    private boolean isDOB(String DOB) {
        int dd = Integer.parseInt(DOB.substring(0,2));
        int mm = Integer.parseInt(DOB.substring(3,5));
        int yyyy = Integer.parseInt(DOB.substring(6,10));
        int maxDay=31;
        if (yyyy<1||mm<1||dd<1||mm>12) return false;
        if (mm==4||mm==6||mm==9||mm==11) maxDay=30;
        else if (mm==2) {
            if (yyyy%4==0&&yyyy%100!=0||yyyy%400==0) maxDay=29;
            else maxDay=28;
        }
        if (dd>maxDay) return false;
        return true;

    }
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", dob='" + getDob() + "'" +
            "}";
    }
    
    
}
