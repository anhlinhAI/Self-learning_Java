/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Clock {

    private String code;
    private String make;
    private int size;
    private int price;

    //constructors
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

    //Clock(String newCode, String newMake, String newSize, String newPrice) {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    //getters, setters
    public String getCode() {
        return code;
    }

    public String getMake() {
        return make;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
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

    public void print() {
        System.out.println("Code: " + code + "; Make: " + make + "; Size: " + size + "; Price: " + price);
        //System.out.println("Code:"+code);
        //System.out.println("Make:"+make);
        //System.out.println("Size:"+size);
        //System.out.println("Price"+price);
    }

}
