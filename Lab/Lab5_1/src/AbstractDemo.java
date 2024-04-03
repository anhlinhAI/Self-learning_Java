/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class AbstractDemo {
    void m1() {
        System.out.println("m1");
    }
    abstract void m2();
}
class Derived extends AbstractDemo{
    public void m1() {
        System.out.println("m1");
    }
    public static void main (String[] args){
        Derived obj = new Derived();
    }
}
