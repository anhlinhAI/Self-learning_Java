
import java.util.ArrayList;
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
public class Menu extends ArrayList<String> {

    Scanner sc = new Scanner(System.in);

    public Menu() {
        super();
    }

    int getUserChoice() {
        int result = 0;
        if (this.size() > 0) {
            for (int i = 0; i < this.size(); i++) {
                System.out.println((i + 1) + ". " + this.get(i));
            }
            while (true) {
                try {
                    System.out.print("Please select an operation: ");
                    result = Integer.parseInt(sc.nextLine());
                    return result;
                } catch (NumberFormatException e) {
                    System.out.println("Integers only.");
                }
            }
        }
        return result;
    }
}
