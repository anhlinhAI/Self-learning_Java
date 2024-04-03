/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab51;

/**
 *
 * @author PC
 */
public class Lab51 {

   public interface InterfaceDemo{
       final int MAXN=100; //constant
       int n=0;  //fields in interface must be initialized
       static public int sqr(int x){
           return x*x;
       }
       public abstract void m1(); // abstract methods
       abstract public void m2();
       void m3(); //default methods
       void m4();
   }
}
   class UseIt{
       public static void main(String args[]) {
           InterfaceDemo obj= new InterfaceDemo() {};
       }
   }
    
