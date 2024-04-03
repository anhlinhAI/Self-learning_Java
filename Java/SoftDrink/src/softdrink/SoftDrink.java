/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softdrink;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SoftDrink {
    private String code="", make="";
    private int volume;
    private float price;
    //Constructor

    public SoftDrink() {
    }

    public SoftDrink(int volume, float price, String code, String make) {
        this.volume = volume;
        this.price = price;
        this.code= code;
        this.make= make;
    }
    //getter and setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // Input detail of SoftDrink
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the SoftDrink Code:");
        code =sc.nextLine();
        System.out.print("Enter the SoftDrink make:");
        make = sc.nextLine();
        System.out.print("Enter the SoftDrink price:");
        price=sc.nextFloat();
        System.out.print("Enter the SoftDrink volume");
        volume=Integer.parseInt(sc.nextLine());
    }
    public String toString(){
        return code + "," + make+"," + price + "," + volume ;
        
        
    }
    
    
}
