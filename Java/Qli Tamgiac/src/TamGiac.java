
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
public class TamGiac  extends DaGiac{
    //Datas fields
    private double canhA , canhB , canhC;
    //Constructors
    //Parameter constructor
    public TamGiac(){
        canhA = 0;
        canhB = 0;
        canhC = 0;
    }
    public TamGiac(double canhA, double canhB, double canhC) {
        if(this.LaTamGiacHopLe(canhC, canhB, canhC)){
            this.canhA = canhA;
            this.canhB = canhB;
            this.canhC = canhC;
        }
        else {
            this.canhA= 1;
            this.canhB=1;
            this.canhC=1;
        }
    }
    //Methods 
    //Getters , Setters
    public void setCanhA(double canhA) {
        if(this.LaTamGiacHopLe(canhA,this.canhB,this.canhC))
            this.canhA = canhA;
        else 
            System.out.println("Failed");
    }
    public void setCanhB(double canhB) {
        if(this.LaTamGiacHopLe(this.canhA, canhB, this.canhC))
            this.canhB = canhB;
    }
    public void setCanhC(double canhC) {
        if(this.LaTamGiacHopLe(this.canhA, this.canhB, canhC))
            this.canhC = canhC;
    }
    public double getCanhA() {
        return canhA;
    }
    public double getCanhB() {
        return canhB;
    }
    public double getCanhC() {
        return canhC;
    }
    private boolean LaTamGiacHopLe(double a , double b , double c){
        return (((a+b)>c && (b+c)>a && (a+c)>b));
    }
    public double tinhChuVi(){
        return (this.canhA+this.canhB+this.canhC);
    }
    public double tinhDT(){
        double p = (this.canhA+this.canhB+this.canhC)/2;
        return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
    }
    public void Input(){
        Scanner sc= new Scanner (System.in);
        System.out.print("Nhap Canh A:");
        canhA=sc.nextDouble();
        System.out.print("Nhap Canh B:");
        canhB=sc.nextDouble();
        System.out.print("Nhap Canh C:");
        canhC=sc.nextDouble();
    }
    public void Output(){
        System.out.println("Canh A:"+canhA);
        System.out.println("Canh B: "+canhB);
        System.out.println("Canh C: "+canhC);
        System.out.println("Chu vi tam giac: "+tinhChuVi());
        System.out.println("Dien tich tam giac :"+tinhDT());
    }
    public void xuat(){
        super.Output();
        System.out.println("Tam giac co 3 canh "+this.canhA+","+this.canhB+","+this.canhC);
    }
}

