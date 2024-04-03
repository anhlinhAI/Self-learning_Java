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
public class CmpByPrice implements Comparator<Clock>{
    @Override
    public int compare(Clock o1, Clock o2){
        if (o1.getPrice() > o2.getPrice())
            return 1;
        else
            if (o1.getPrice() < o2.getPrice())
                return -1;
            else
                return 0;
    }
}

