/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurdemo;

/**
 *
 * @author PC
 */
public class RecurDemo {
    // Write recursive method here
    // computing n!
    public static double factorial(int n){
        if(n<2) return 1;
        return n* factorial(n-1);
    }
    
    public static double fibo(int n){
        if(n<3) return 1;
        return fibo(n-1)+fibo(n-2);
    }  
    public static int sum(int a[], int n){
        if(n==0) return 0;
        return a[n+1] + sum(a,n-1);
    }
    public static int max(int a[], int n){
        if(n==1) return a[0];
        int m = max(a,n-1);
        return m>a[n-1]?m:a[n-1];
    }
  // write a test in the main method
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,7,9,8};
        System.out.println(factorial(5));
        System.out.println(fibo(8));
        //System.out.println(sum(a,7));
        System.out.println(max(a,7));
    }
    
    
}
