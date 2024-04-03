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
public class Saleman extends Employee {
    private double sale, rate;
    Scanner sc = new Scanner(System.in);


    public Saleman() {
        this.sale = 0;
        this.rate = 0;
    }

    public Saleman(double sale, double rate) {
        this.sale = sale;
        this.rate = rate;
    }
    
    public Saleman(String code, String name, String dob, double sale, double rate) {
        super(code, name, dob);
        this.sale = sale;
        this.rate = rate;
    }

    public double getSalary() {
        return this.sale*this.rate/100;
    }


    public double getSale() {
        return this.sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void input() {
        System.out.println("Enter sale: ");
        this.sale = Double.parseDouble(sc.nextLine());
        System.out.println("Enter rate: ");
        this.rate= Double.parseDouble(sc.nextLine());
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
