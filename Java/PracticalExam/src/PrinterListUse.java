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
     I_Menu menu= new Menu();
        menu.addItem("1- Add a new Printer (format: PRxxx)");
        menu.addItem("2- Update a Printer");
        menu.addItem("3- Print list");
        menu.addItem("other - quit");
        int choice;
        I_list list = new PrinterList();
    do{
        choice=menu.getChoice();
        switch(choice){
            case 1: list.add();break;
            case 2: list.update();break;
            case 3:list.sort();list.output();break;
        }
    }
    while(choice>=0&&choice<=3);
}
}