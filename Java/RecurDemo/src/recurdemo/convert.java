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
public class convert {
    public static String convert(int n, int base){
        return convert(n/base,base)+Character.forDigit(n%base,base);
    }
    public static void main(String[] args) {
        System.out.println("Binary: " + convert(266,2));
        System.out.println("Decimal: "+ convert(266,10));
        System.out.println("Octal: "+ convert(266,8));
        System.out.println("Hexadecimal: "+ convert(266,16));
    }
}
