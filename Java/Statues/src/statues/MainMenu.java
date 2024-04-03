/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statues;

/**
 *
 * @author PC
 */
public class MainMenu {
    public static void main(String[] args) {
         Menu menu = new Menu();
         menu.add("------------------------------");
        menu.add("1- Add new statues");
        menu.add("2- Update statues");
        menu.add("3- Remove statues");
        menu.add("4- Print list");
        menu.add("5- Others- Quit");
        StatuesList list = new StatuesList();
        int choice = 0;
        
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addStatues();
                    break;
                case 2:
                    list.updateStatues();
                    break;
                case 3:
                    list.removeStatues();
                    break;
                case 4:
                    list.output();
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
