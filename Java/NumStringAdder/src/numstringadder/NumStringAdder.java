/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numstringadder;

import java.util.Stack;

/**
 *
 * @author PC
 */
public class NumStringAdder {

    public static int add(int carry, char d1, char d2, Stack resultStk) {
        int newCarry = 0;
        int num1 = Character.getNumericValue(d1);
        int num2 = Character.getNumericValue(d2);
        int sum = carry + num1 + num2;
        if (sum >= 10) { //sum = 13
            newCarry = 1; //newCarry =1
            sum -= 10;   // sum = 3 --> '3' is result
        }
        resultStk.push(Character.forDigit(sum, 10)); // push '3' to result stack
        return newCarry; // for next addition

    }

    public static String add(String num1, String num2) {
        Stack< Character> stk1 = new Stack();
        Stack< Character> stk2 = new Stack();
        int i;
        // push digits in num1 , num2 to their stacks
        for (i = 0; i < num1.length(); i++) {
            stk1.push(num1.charAt(i));
        }
        for (i = 0; i < num2.length(); i++) {
            stk2.push(num2.charAt(i));
        }
        // Add characters to stack stk3
        Stack< Character> stk3 = new Stack();
        char d1, d2;
        int carry = 0;
        while (!stk1.empty() || !stk2.empty()) {
            d1 = (!stk1.empty()) ? stk1.pop() : '0';
            d2 = (!stk2.empty()) ? stk2.pop() : '0';
            carry = add(carry, d1, d2, stk3);
        }
        // pop stk3 to result string
        String result = "";
        while (!stk3.empty()) {
            result += stk3.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String num1 = "592";
        String num2 = "3784";
        String sumStr = add(num1, num2);
        System.out.println(sumStr);
    }

} // End of the NumStringAdder class
