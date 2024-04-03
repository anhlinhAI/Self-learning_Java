/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author PC
 */
public abstract class AbtractDemo2 {
    void m1() //It is not abstract class
    { System.out.println("m1");
    }
    void m2(){  // it is not abstract class
        //empty body
    }
    public static void main(String[] args) {
        AbstractDemo2 obj = new AbstractDemo2();
    }
}
