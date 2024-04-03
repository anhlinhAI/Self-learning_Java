/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clock {

    String id = "", manufact = "";
    int price = 0, guarantee = 0;
    Scanner sc = new Scanner(System.in);

    public Clock() {
        super();
    }

    public Clock(String id) {
        this.id = id;
    }

    public Clock(String id, String manufact, int price, int guarantee) {
        this.id = id;
        this.manufact = manufact;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int inputInt() {
        while (true) {
            try {
                int validInt = Integer.parseInt((sc.nextLine()));
                return validInt;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input!!! Enter again: ");
            }
        }
    }

    public String inputString() {
        while (true) {
            try {
                String validString = sc.nextLine();
                if (validString.equals("")) {
                    throw new Exception("");
                }
                return validString;
            } catch (Exception e) {
                System.out.print("Invalid input!!! Enter again: ");
            }
        }
    }

    @Override
    public String toString() {
        return id + ", " + manufact + ", " + price + ", " + guarantee;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Clock) obj).id);
    }

    public void input() {
        System.out.print("Enter Clock's ID: ");
        id = inputString();
        System.out.print("Enter Manufacturer: ");
        manufact = inputString();
        System.out.print("Enter price: ");
        price = inputInt();
        System.out.print("Enter number of guarantee month: ");
        guarantee = inputInt();
    }
 
    
}
