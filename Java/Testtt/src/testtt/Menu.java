/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu extends ArrayList<String> {
    //methods
	
	public void addChoice(String s) {
		super.add(s);
	}	

   	public int getChoice() {
        	if (this.isEmpty()==true) {
	            System.out.println("Menu is empty!");
        	    return -1;
        	}
        	else {
            	int count=0;
            	for (String s:this) {
                	System.out.println(count+1+"-"+s);
               	 	count++;
            	}
           	int choice;
            	System.out.print("User option: ");
		Scanner sc = new Scanner(System.in);
            	choice = Integer.parseInt(sc.nextLine());
            	return choice;
        	}
    	}
}
