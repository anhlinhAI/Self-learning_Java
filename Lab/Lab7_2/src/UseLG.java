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
        EmployeeList list = new EmployeeList();
        
        
        //Student s = new Student("c1", "name1", 7);
        //list.add(s);
        
        list.add(new Employee("c1", "Linh", "15-6",50000));
        list.add(new Employee("c2", "Vy", "10-8",30000));
        list.add(new Employee("c3", "Nga", "23-9",40000));
        list.add(new Employee("c4", "Yen", "1-1",30000));
        
        //Collections.sort(list);
        list.sort();
        list.print();
    }
}
