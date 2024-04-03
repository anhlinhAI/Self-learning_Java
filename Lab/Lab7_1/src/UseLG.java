/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class UseLG {
    public static void main(String[] argv){
        ClockList list = new ClockList();
        
        
        //Student s = new Student("c1", "name1", 7);
        //list.add(s);
        
        list.add(new Clock("1, ", "Seiko, ", 5, 9));
        list.add(new Clock("2, ", "Casio, ", 4, 7));
        list.add(new Clock("3, ", "Rolex, ", 3, 8));
        list.add(new Clock("4, ", "Seiko, ", 2, 7));
        
        //Collections.sort(list);
        list.sort();
        list.print();
    }
}
