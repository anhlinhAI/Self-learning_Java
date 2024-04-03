/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class CmpBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        if (o1.getSalary() > o2.getSalary())
            return 1;
        else
            if (o1.getSalary() < o2.getSalary())
                return -1;
            else
                return 0;
    }
}