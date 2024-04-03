/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab43;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
   ArrayList<String> hints = new ArrayList<>();
   
   public Menu() {

   }

   public void add(String newString) {
       hints.add(newString);
   }

   public int getChoice() {
        int result=0;
        for (int i=0;i<hints.size();i++) {
           System.out.println((i+1)+ " - " + hints.get(i));
        }
        System.out.println("Choose option: ");
        result = Integer.parseInt(sc.nextLine());
        return result; 
   }
            
    
}
