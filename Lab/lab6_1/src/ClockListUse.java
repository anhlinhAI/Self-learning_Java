/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ClockListUse {
   public static void main(String args[]){
       I_Menu menu = new Menu();
       menu.addItem("1. Add new clock");
       menu.addItem("2. Remove a clock");
       menu.addItem("3. Update a clock");
       menu.addItem("4. Print list");
       menu.addItem("Others: Quit");
       int choice;
       I_List list = new ClockList();
       do{
           choice= menu.getChoice();
           switch(choice){
               case 1: {System.out.println("Input code, make, size, price of the clock: ");
                        Scanner sc = new Scanner(System.in);
                        String inputString;
                        inputString = sc.nextLine();
                        list.addClock(inputString);
                        break;
               }
               case 2: list.remove();break;
               case 3: list.update();break;
               case 4: list.sort(); list.output();break;
           }
       }
       while (choice>=0 && choice<=4);
   }
}
