/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.util.Comparator;
import java.util.Scanner;

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
        public int compare(Object t, Object t1) {
            return ((Clock) t).ID.compareTo(((Clock) t1).ID);
        }
    };
    public Clock (String ID){
        this.ID = ID;
        
    }
    public Clock (String ID, String manu, int price){
        this.ID=ID;
        this.manufacturer= manu;
        this.price=price;
    }

   public Clock(){
       super();
   }

    @Override
    public String toString() {
        return"ID = " + ID + ", manufacturer = " + manufacturer + ", price = " + price ;
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
    public void input(){
        System.out.println("--- Add a Clock ---");
        System.out.print("Please input ID clock: ");
        ID = sc.nextLine();
        System.out.print("Please input manufacturer: ");
        manufacturer =sc.nextLine();
        System.out.print("Please input price: ");
        price = Integer.parseInt(sc.nextLine());
    }
    
}
