
import java.util.LinkedList;
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
public class ContainerList extends LinkedList<Container> {

    Scanner sc = new Scanner(System.in);

    public void addContainer() {
        Container ctn = new Container();
        ctn.input();
        if (this.add(ctn) == true) {
            System.out.println("--- Added Successfully ---: ");
        } else {
            System.out.println("--- Added failed! ---");
        }
    }

    private int search(String id) {
        return this.indexOf(new Container(id));
    }

    public void removeContainer() {
        String ID;
        System.out.print("Input Container ID which will be removed:");
        ID = sc.nextLine();
        int pos = search(ID);
        if (pos < 0) {
            System.out.println("--- Can not found! ---");
        } else {
            this.remove(pos);
            System.out.println("--- Container " + ID + " was deleted ---");
        }
    }
    public void print() {
        for (Container ctn : this) {
            System.out.println("ID , Volume , netWeight , growWeight");
            System.out.println(ctn);
        }
    }
    public void printVolume() {
        double minVal, maxVal;
        System.out.println("____ Input volume range ____ ");
        System.out.print("- Please input min volume: ");
        minVal = Double.parseDouble(sc.nextLine());
        System.out.print("- Please input max volume: ");
        maxVal = Double.parseDouble(sc.nextLine());
        if (minVal > maxVal) {
            double t = minVal;
            minVal = maxVal;
            maxVal = t;
        }
        for (Container ctn : this) {
            double volume = ctn.volume;
            if (volume >= minVal && volume <= maxVal) {
                System.out.println(ctn);
            }
        }
    }
}
