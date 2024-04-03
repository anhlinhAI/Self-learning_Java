/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu extends ArrayList<String> {

    public Menu() {
        super();
    }

    public void addItem(String s) {
        this.add(s);
    }

    public int getChoice() {
        int result;
        for (String s : this) {
            System.out.println(s);
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Please input right choice form 1 to 7: ");
            }
        }
    }

}

