
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class CmpByPriceAndType implements Comparator<Printer> {

    public int compare(Printer o1, Printer o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if (o2.getType().compareTo(o2.getType()) < 0) {
            return 1;
        } else if (o2.getType().compareTo(o2.getType()) > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
