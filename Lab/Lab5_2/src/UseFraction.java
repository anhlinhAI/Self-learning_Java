/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class UseFraction {
    public static void main(String[] argv){
        Fraction f1, f2,f3;
        f1 = new Fraction();
        f2 = new Fraction();
        Menu2 menu = new Menu2(5);
        int choice;
        
        menu.addItem("Plus 2 fractions: '+' ");
        menu.addItem("Subtract 2 fractions: '-' ");
        menu.addItem("Multiply 2 frartion: '*' ");
        menu.addItem("Divide 2 fractions: '/' ");
        
        do {  
            choice = menu.getChoice();
            switch(choice)
            {
                case 1: f1.Input();
                        f2.Input();
                        f3 = (Fraction) f1.add(f2);
                        f3.Output();break;
                case 2: 
                        f1.Input();
                        f2.Input();
                        f3 =  (Fraction) f1.sub(f2);
                        f3.Output();break;
                case 3: f1.Input();
                        f2.Input();
                        f3 = (Fraction) f1.mul(f2);
                        f3.Output();break;
                case 4: 
                        f1.Input();
                        f2.Input();
                        f3 = (Fraction) f1.div(f2);
                        f3.Output();break;
                default: System.out.println("Quit!");
            } 
        } while (choice>0 && choice<5);
        
        
        
    }
}
