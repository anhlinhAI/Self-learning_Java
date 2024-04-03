
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class DaGiac {
    //Data fields
    private int soCanh;
    
    //Constructor

    public DaGiac() {
        this.soCanh=3;
    }

    public DaGiac(int soCanh) {
        if(soCanh>=3)
        this.soCanh = soCanh;
    }
    //Getters Setters

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        if(soCanh>=3)
        this.soCanh = soCanh;
    }
    //Methods
    public double TinhDT(){
        System.out.println("Dien tich:");
        return 0;
    }
    public double TinhCV(){
        System.out.println("Chu vi:");
        return 0;
    }
    public void Output(){
        System.out.println("Toi la da giac co" + this.soCanh +"canh");
    }
    
    
}
