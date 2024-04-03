/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface InterfaceDemo {
    final int MAXN=100;
    int n=0;
    static public int sqr(int x){return x*x;}
    public abstract void m1();
    abstract public void m2();
    void m3();
    void m4();
}

class A implements InterfaceDemo {
    public void m1() {
        System.out.println("M1");
    }
    public void m2(){
        System.out.println("M2");
    }
    public void m3() {System.out.println("M3");}
    public void m4() {System.out.println("M4");}
}

class UseIt {
    public static void main (String atgs[]){
        InterfaceDemo obj = new A();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        int s= InterfaceDemo.sqr(5);
        System.out.println("5x5=" + s);
    }
}