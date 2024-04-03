/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab11 {
    public static void main(String args[])
    { int a[]; 
      int n;
      int i;
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n= Integer.parseInt(sc.nextLine());
        a = new int[n];
        for (i=0; i<n; i++)
        { System.out.print("Enter the" + (i+1) + "/" + n + "elements: ");
          a[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.print("Enter values: ");
        for (i=0;i<n;i++) System.out.format("%5d", a[i]);
        int sum=0;
        for(i=0; i<n;i++){
            if(a[i]%2==0) sum+=a[i];
        }
         System.out.println("\nSum even values = "+ sum);
        
        
    }
        
    
    
}
