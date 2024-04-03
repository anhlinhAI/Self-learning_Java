/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class PrinterListUse {

    public static void main(String[] args) {
        I_Menu menu = new Menu();
        menu.addItem("1- Add");
        menu.addItem("2- Update");
        menu.addItem("3- Print List");
        menu.addItem("other- quit");
        I_List list = new PrinterList();
        int choice;
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.update();
                    break;
                case 3:
                    list.sort();
                    list.output();
                    break;
            }
        } while (choice >= 0 && choice <= 3);
    }
}
