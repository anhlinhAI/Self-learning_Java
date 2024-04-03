/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StoreListUse { 
    public static void main(String[] args) {
        String filename = "stores.dat";
        I_Menu menu= new Menu();
        menu.addItem("\n");
        menu.addItem("1- Add a new Store (format: Sxxx)");
        menu.addItem("2- Find a Store");
        menu.addItem("3- Remove a Store");
        menu.addItem("4- Update a Store");
        menu.addItem("5- Print list");
        menu.addItem("6- Save the list  of store.txt");
        menu.addItem("7- Save the list to binary file");
        menu.addItem("other - quit");
        menu.addItem("\n");
        menu.addItem("-------------------------------------------------");
        menu.addItem("Please Choice : ");
        int choice;
        I_List list = new StoreList();
        list.loadStoreFromFile(filename );
        do {
            choice = menu.getChoice();
            switch(choice){
                case 1: list.add();break;
                case 2: list.Search();break;
                case 3: list.remove();break;
                case 4: list.update();break;
                case 5: list.sort(); list.output();
                        break;
                case 6: list.save();break;
                case 7: list.saveToFile(filename);break;
            }
        }
        while(choice>=0&& choice <=6);
        }        
        }         

    

    
            
    

