/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class StoreListUse {
   public static void main(String args[]){
       I_Menu menu = new Menu();
       menu.addItem("1. Add new store");
       menu.addItem("2. Search a store");
       menu.addItem("3. Remove a store");
       menu.addItem("4. Update a store");
       menu.addItem("5. Print list");
       menu.addItem("6. Save the list to txt file");
       menu.addItem("Others: Quit");
       int choice;
       I_List list = new StoreList();
       do{
           choice= menu.getChoice();
           switch(choice){
               case 1: {System.out.println("Input code, name, address, sales, anvenue of the store: ");
                        Scanner sc = new Scanner(System.in);
                        String inputString;
                        inputString = sc.nextLine();
                        list.addStore(inputString);
                        break;
               }
               case 2: list.search();break;
               case 3: list.remove();break;
               case 4: list.update();break;
               case 5: list.sort(); list.output();break;
           }
       }
       while (choice>=0 && choice<=4);
   }
}

