/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Menu2 extends ArrayList<String> implements I_Menu{
    public Menu2(int size){
        super(size);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void addItem(String s) {
        add(s);
    }

    @Override
    public int getChoice() {
        int result = 0;
        if(size()>0)
        {
            int i;
            for(i=0;i<size();i++)
            {
                System.out.println(i+1 + ". " +get(i));
            }
            System.out.println("Please get choice: ");
            result = Integer.parseInt(sc.nextLine());
        }
        return result;
    }
    
}
