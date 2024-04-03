/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ContainerManager {
    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println("---------------------------");
        menu.add("Add a Container ");
        menu.add("List all container ");
        menu.add("List container have minVa l<= volume <= maxVal ");
        menu.add("Remove a container base on it's ID");
        menu.add("Other - quit");
        
        ContainerList list = new ContainerList();
        int userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    list.addContainer();
                    break;
                case 2:
                    list.print();
                    break;
                case 3:
                   list.printVolume();
                    break;
                case 4:
                    list.removeContainer();
                    break;
               
            }
        } while (userChoice >= 0 && userChoice < 5);
    }
}
