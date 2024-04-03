/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.util.Stack;

/**
 *
 * @author PC
 */
public class Converter {

   public static String convert  ( int n, int base){
       String result = "";
       // push remainder to stack
       Stack<Integer> stk = new Stack ();
       do {
           stk.push(n%base);
           n /=base;
       }while (n>0);
       // pop values in stack then concatenate it to the result
       while (!stk.empty()){
           int value = stk.pop();
           result += Character.forDigit(value, base); // digit in base system
       }
       return result;
   }
    public static void main(String[] args) {
        int n=106;
        System.out.println(convert(n,2)+"b");
        System.out.println(convert(n,8)+"q");
        System.out.println(convert(n,10)+"d");
        System.out.println(convert(n,16)+"h");
    }
}
