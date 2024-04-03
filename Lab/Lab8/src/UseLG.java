
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TaiNT
 */
public class UseLG {
    public static void main(String[] argv){
        StudentList list = new StudentList();
        
        
        //Student s = new Student("c1", "name1", 7);
        //list.add(s);
        
        list.add(new Student("c1", "name4", 9));
        list.add(new Student("c2", "name1", 7));
        list.add(new Student("c3", "name3", 8));
        list.add(new Student("c4", "name3", 7));
        
        //Collections.sort(list);
        list.sort();
        list.print();
    }
}
