
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Container {
    String ID;
    double volume, netWeight, growWeight;
   Scanner sc = new Scanner(System.in);

    public Container(String ID, double volume, double netWeight, double growWeight) {
        this.ID = ID;
        this.volume = volume;
        this.netWeight = netWeight;
        this.growWeight = growWeight;
    }
    public Container(String ID){
        this.ID=ID;
    }

    public Container() {
        super();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrowWeight() {
        return growWeight;
    }

    public void setGrowWeight(double growWeight) {
        this.growWeight = growWeight;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public double inputDouble() {
        while (true) {
            try {
                double validDouble = Double.parseDouble(sc.nextLine());
                return validDouble;
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
      public String toString() {
        return ID + ", " + volume + ", " + netWeight + ", " + growWeight;
    }
      public boolean equals(Object obj) {
        return this.ID.equals(((Container) obj).ID);
    }
      public void input() {
        System.out.print("Enter Container's ID: ");
        ID= inputString();
        System.out.print("Enter volume: ");
        volume = inputDouble();
        System.out.print("Enter netWeight: ");
        netWeight = inputDouble();
        System.out.print("Enter growWeight: ");
        growWeight = inputDouble();
    }
 
}
