/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class ClockList extends TreeSet<Clock> {

    Scanner sc = new Scanner(System.in);

    public ClockList() {
        super(Clock.comparator);
    }

    public Clock search(String ID) {
        return this.ceiling(new Clock(ID));
    }

    public void output() {
        Iterator it = this.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addClock() {
        Clock clk = new Clock();
        clk.input();
        if (this.add(clk) == true) {
            System.out.println("--- Added Successfully ---: ");
        } else {
            System.out.println("--- Added failed! ---");
        }
    }

    public void removeClock() {
        try {
            String ID = null;
            System.out.print("Please input ID to remove: ");
            ID = sc.nextLine();
            Clock ck = search(ID);
            if (ck == null || !ck.getID().equals(ID)) {
                System.out.println("Clock " + ID + " does not exist");
            } else {
                System.out.println("Found: " + ck);
                this.remove(ck);
                System.out.println("Done !");
            }
        }catch (NullPointerException e){
            
        }
    }
    public void print() {
        for (Clock clk : this) {
            System.out.println(clk);
        }
    }
    public void searchID(){
        String ID;
        System.out.print("Please input ID to find: ");
            ID = sc.nextLine();
        Clock ck = search(ID);
        if(ck==null || !ck.getID().equals(ID))
            System.out.println("Clock " + ID + " does not exist");
        else System.out.println("Found: " + ck);
    }
}
