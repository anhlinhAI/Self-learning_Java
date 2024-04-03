/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public interface InterfaceDemoT {
    final int MAXN=100; //constant
    int n = 0; //Fields in interface must be initialized
    static public int sqr(int x) {
        return x*x;
    }
    public abstract void m1(); //abstract methods
    abstract public void m2();
    void m3(); //default methods
    void m4();
}
class B implements InterfaceDemoT{
     //overriding methods
    public void m1() {
        System.out.println("M1");
    }
    public void m2(){
        System.out.println("M2");
    }
    public void m3(){
        System.out.println("M3");
    }
    public void m4(){
        System.out.println("M4");
    }
}
class Useit{
    public static void main(String[] args) {
        InterfaceDemoT obj=new B();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        int s= InterfaceDemoT.sqr(5);
        System.out.println("5x5=" + s);
    }
}
