/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Lab2_1 {
    double chieuDai;
    double chieuRong;
    double chuVi=0;
    double dienTich=0;
    void Input(){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter value of length: ");
        chieuDai = Double.parseDouble(sc.nextLine());
        System.out.print("Enter value of width: ");
        chieuRong = Double.parseDouble(sc.nextLine());        
    }
    void Execute() {
        chuVi=(chieuDai+chieuRong)*2;
        dienTich=chieuDai*chieuRong;
    }
    void Output() {
        System.out.println("Information of the rectangle: ");
        System.out.println("The circumference: " +(chuVi));
        System.out.println("The area: " + (dienTich));
    }
}