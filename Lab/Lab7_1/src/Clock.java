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
public class Clock {
    //attributes
    private String code;
    private String make;
    private int size,price;
    
    //contructors
    public Clock() {
        this.code = "";
        this.make = "";
        this.size = 0;
        this.price = 0;
    }
    public Clock(String code, String make, int size, int price) {
        this.code = code;
        this.make = make;
        this.size = size;
        this.price = price;
    }
    //getters, setters
    public String getCode() {
        return code;
    }

    public String getMake() {
        return make;
    }

    public double getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
     public void setPrice(int price) {
        this.price = price;
    }
    
    //other methods
    public void print(){
        System.out.println("Code: "+ code+" Make: "+ make+" Size: "+ size+ "Price: "+ price);
    }
    
    //use Comparable interface
    public int compareTo(Clock s){        
        /*if (this.score > s.score )
            return 1;
        else
            if (this.score < s.score)
                return -1;
            else
        */
                
        if (this.getMake().compareTo(s.getMake()) > 0)
            return 1;
        else
            if (this.getMake().compareTo(s.getMake()) < 0)
                return -1;
            else
                if (this.price > s.price )
                    return 1;
                else
                    if (this.price < s.price)
                        return -1;
                    else
                        return 0;
        
    }
    
    //use comparator interface and anonymous class    
    public static Comparator objCmpByScore = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
        Clock c1 = (Clock)o1;
        Clock c2 = (Clock)o2;
        
        if (c1.price > c2.price )
            return 1;
        else
            if (c1.price < c2.price)
                return -1;
            else
                return 0;
        }
    };
    
    //using Generic: no need casting
    public static Comparator objCmpByCode = new Comparator<Clock>(){
        @Override
        public int compare(Clock c1, Clock c2) {
        
        if (c1.getCode().compareTo(c2.getCode()) > 0)
            return 1;
        else
            if (c1.getCode().compareTo(c2.getCode()) < 0)
                return -1;
            else
                return 0;
        }
    };
    
    public static Comparator objCmp2 = new Comparator<Clock>(){
        @Override
        public int compare(Clock c1, Clock c2) {
        
        if (c1.getMake().compareTo(c2.getMake()) > 0)
            return 1;
        else
            if (c1.getMake().compareTo(c2.getMake()) < 0)
                return -1;
            else
                if (c1.getPrice()>c2.getPrice())
                    return 1;
                else
                    if (c1.getPrice()<c2.getPrice())
                        return -1;
                    else
                        return 0;
        }
    };

}

