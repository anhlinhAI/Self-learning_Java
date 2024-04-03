/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author PC
 */
public class ClockMng2 {

    public static void main(String[] args) {
        while (true) {
            try {
                Menu menu = new Menu();
                System.out.println("---------------------------");
                menu.add(" Add a Clock ");
                menu.add(" Remove a Clock ");
                menu.add(" Print list");
                menu.add(" Search clock");
                menu.add("Other - quit");

                ClockList list = new ClockList();
                int userChoice;
                do {
                    userChoice = menu.getUserChoice();
                    switch (userChoice) {
                        case 1:
                            list.addClock();
                            break;
                        case 2:
                            list.removeClock();
                            break;
                        case 3:
                            list.print();
                            break;
                        case 4:
                            list.searchID();
                            break;

                    }
                } while (userChoice >= 0 && userChoice < 5);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please choice number from 1 to 6!");
            }
        }

    }
}
