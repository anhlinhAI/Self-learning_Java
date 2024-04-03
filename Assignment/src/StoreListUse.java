/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class StoreListUse {
   public static void main(String args[]){
       //String filename = "stores.dat";
       I_Menu menu = new Menu();
       menu.addItem("-----------------------------");
       menu.addItem("1. Add new store");
       menu.addItem("2. Search a store");
       menu.addItem("3. Remove a store");
       menu.addItem("4. Update a store");
       menu.addItem("5. Print list");
       menu.addItem("6. Save the list to txt file");
       menu.addItem("7. Save the list to the binary file");
       menu.addItem("Others: Quit\n");
       menu.addItem("Your choice: ");
       int choice;
       I_List list = new StoreList();
       //list.loadStoreFromFile(filename);
       do{
           System.out.println("Store Manager");
           choice= menu.getChoice();
           switch(choice){
               case 1: list.add(); break;
               case 2: list.search();break;
               case 3: list.remove();break;
               case 4: list.update();break;
               case 5: list.sort(); list.output();
                       break;
               case 6: list.save(); break;
               case 7: list.saveToFile(); break;
           }
       }
       while (choice>=0 && choice<=6);
   }
}

