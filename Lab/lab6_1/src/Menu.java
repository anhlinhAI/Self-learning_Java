/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Menu extends ArrayList<String> implements I_Menu{
    public Menu(){
        super();
    }
    
    @Override
    public void addItem(String s){
        this.add(s);
        return;
    }
    
    public int getChoice(){
        int result;
        //for (int i=0; i<this.size(); i++)
        //    System.out.println(this.get(i));
        
        for (String s:this)
            System.out.println(s);
        
        Scanner sc= new Scanner(System.in);
        result= Integer.parseInt(sc.nextLine());// get user choice
        return result;
    }
}
