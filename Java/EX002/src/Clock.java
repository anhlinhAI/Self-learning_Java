
import java.util.Comparator;
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
public class Clock {
    String ID = "";
    String manufacturer = "";
    int price = 0;
    Scanner sc = new Scanner(System.in);

    public static Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Clock) o1).ID.compareTo(((Clock) o2).ID);
        }
    };

    public Clock(String ID) {
        this.ID = ID;
    }

    public Clock(String ID, String manufacturer, int price) {
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return ID + ", " + manufacturer + ", " + price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public static Comparator getComparator() {
        return comparator;
    }

    public static void setComparator(Comparator comparator) {
        Clock.comparator = comparator;
    }

}
