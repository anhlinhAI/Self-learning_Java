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
public abstract class AbstractDemo2T {
    void m1(){ //it is not abstract class
        System.out.println("m1");
    }
    abstract void m2();
}
class Derived extends AbstractDemo2T{
    public void m1() //override
    { System.out.println("m1");
    }
    public void m2(){
        
    }
    public static void main(String[] args) {
        Derived obj= new Derived();
    }
    
}
