/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking.bk.use;

/**
 *
 * @author PC
 */
public class Item {
    String code ;
    String name;
    double price;
    public Item (String code , String name, double price){
        this.code=code;
        this.name=name;
        this.price=price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return code + ", " + name + ", " + (int) price + "\n";
    }
}
