/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class ClockList extends ArrayList<Clock>{
    //no more attributes
    //constructors
    public ClockList() {
        super();
    }
    public ClockList(int initialCapacity) {
        super(initialCapacity);
    }
    
    //other methods
    @Override
    public boolean add(Clock s){
        /*
        boolean rc;
        rc=super.add(s);
        return rc;
        */
        return super.add(s);
    }
    
    public void print(){
        
        //for(int i=0; i<this.size(); i++)
            //this.get(i).print();
        
        Iterator iter = this.iterator();
        while (iter.hasNext())
            ((Clock)(iter.next())).print();
    }
    
    public void sort(){
        //1/ using Comparable interface
        //list of object (Student) has implemented Comparable interface
        //Collections.sort(this);
        
        //2/ use Comparator interafce
        //2a/ using a separate class
        CmpByPrice objComparator = new CmpByPrice();
        Collections.sort(this, objComparator);        
        Collections.sort(this, new CmpByPrice());
        
        //using sort method of ArrayList
        //super.sort(new CmpByScore());
        
        //2b/ using anonymous class technique
        //Collections.sort(this, Student.objCmpByScore);
        //super.sort(Student.objCmpByScore);
        
        //another sort order
        //Collections.sort(this, Student.objCmpByCode);
        
        //another sort order again
        //Collections.sort(this, Student.objCmp2);
    }
}

