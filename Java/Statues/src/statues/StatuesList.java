/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statues;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class StatuesList extends TreeSet<Statues> {

     Scanner sc = new Scanner(System.in);

    public StatuesList() {
        super();
    }

    public Statues search(String ID) {
        return this.ceiling(new Statues(ID));

    }

    public void searchStatues() {
        System.out.println("Enter statues id which need to be searched: ");
        String ID = sc.nextLine();
        Statues st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("Statues " + ID + " does not exist");
        } else {
            System.out.println("Found: " + st);
        }
    }

    public void addStatues() {
        System.out.println("_____& Add Statues &______");
        System.out.print("Enter statues ID: ");
        String ID = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter statues height: ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("Enter statues weight: ");
        double weight = Double.parseDouble(sc.nextLine());
        if (this.add(new Statues(ID, author, height, weight))) {
            System.out.println("---- Added successfully! ---");
        } else {
            System.out.println("Added failed!");
        }
    }

    public void updateStatues() {
        if (this.isEmpty()) {
            System.out.println("--- Empty list! ---");
            return;
        }
        System.out.println("_____& Update Statues &______");
        System.out.print("Enter statues ID which will be updated: ");
        String ID = sc.nextLine();
        Statues st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("--- Statues " + ID + " does not exist ---");
            return;
        } else {
            System.out.print("Enter author: ");
            st.setAuthor(sc.nextLine());
            System.out.print("Enter statues weight : ");
            st.setWeight(Double.parseDouble(sc.nextLine()));
            System.out.print("Enter statues height : ");
            st.setHeight(Double.parseDouble(sc.nextLine()));
            System.out.println("--- Update statues " + ID + " successfully! ---");
        }

    }

    public void removeStatues() {
        if (this.isEmpty()) {
           System.out.println("--- Empty list! ---");
            return;
        }
        System.out.println("_____& Remove Statues &______");
        System.out.print("Enter statues ID which will be deleted: ");
        String ID = sc.nextLine();
        Statues st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("--- Statues " + ID + " does not exist ---");
            return;
        } else {
            if (this.remove(st)) {
                System.out.println("--- Remove statues " + ID + " successfully! ---");
            } else {
                System.out.println("--- Delete failed! ---");
            }
        }
    }

    public void output() {
        if (this.isEmpty()) {
            System.out.println("--- Empty list! ---");
        } else {
            Iterator it = this.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

}
