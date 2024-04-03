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
public class Manager extends Employee {
     private int level;
    private static double baseSalary;


    public Manager() {
        this.level = 0;
    }

    public Manager(int level) {
        this.level = level;
    }

    public Manager(String code, String name, String dob, int level) {
        super(code, name, dob);
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void input() {
        System.out.println("Enter level: ");
        this.level = Integer.parseInt(sc.nextLine());
    }

    public static void setBaseSalary(double baseSalary) {
        Manager.baseSalary = baseSalary;
    }

    public double getSalary() {
        return this.level*baseSalary;
    }
    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", dob='" + getDob() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }

    
}
