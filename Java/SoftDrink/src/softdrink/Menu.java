/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softdrink;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
    String[] hints; 
    int n =0; //current number of hints
    // create a menu with size elementss
    
    public Menu(int size){
        if (size<1) size = 10;
        hints = new String[size];   
    }
    // add a hint
    public void add (String aHint){
        if(n<hints.length)
        { hints[n++]=aHint;
            
        }
    }
    // get user choice
    public int getchoice(){
        int result=0;
        if(n>0)
        {  //print out hint
            for (int i=0; i<n;i++) 
                System.out.println((i+1) + "-" + hints[i]);
            System.out.print("please select an operation:");
            Scanner sc= new Scanner(System.in);
            
            result = Integer.parseInt(sc.nextLine());
        } 
        return result;
    }
    
    
    
    
}
