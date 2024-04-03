/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;
/**
 *
 * @author TaiNT
 */
public class CmpByScore implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if (o1.getScore() > o2.getScore())
            return 1;
        else
            if (o1.getScore() < o2.getScore())
                return -1;
            else
                return 0;
    }
}
