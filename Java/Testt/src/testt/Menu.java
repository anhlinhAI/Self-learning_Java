/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu extends ArrayList<String> implements I_Menu {
    //methods

    @Override
    public void addChoice(String s) {
        super.add(s);
    }

    public int getChoice() {
        int result;
        for (String s : this) {
            System.out.println(s);
        }
        Scanner sc = new Scanner(System.in);
        result = Integer.parseInt(sc.nextLine());
        return result;

    }
}
