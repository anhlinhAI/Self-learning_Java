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
public class CmpByNameAndSales implements Comparator<Store>{
    @Override
    public int compare(Store o1, Store o2){
        if (o1.getName().compareTo(o2.getName()) > 0)
            return 1;
        else if (o1.getName().compareTo(o2.getName()) < 0)
            return -1;
        else if (o1.getSales() < o2.getSales())
            return 1;
        else if (o1.getSales() > o2.getSales())
            return -1;
        else
            return 0;
    }
}
