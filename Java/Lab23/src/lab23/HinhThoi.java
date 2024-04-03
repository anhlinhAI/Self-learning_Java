/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23;

/**
 *
 * @author PC
 */
public class HinhThoi extends HinhThang {
    //Fields
    private int Cheo1;
    private int Cheo2;
    //Constructors
    HinhThoi(){

    }
    HinhThoi(int Cheo1,int Cheo2){
        this.Cheo1 =Cheo1;
        this.Cheo2 =Cheo2;
    }
    //setters and getters

    public void setCheo1(int cheo1) {
        Cheo1 = cheo1;
    }

    public void setCheo2(int cheo2) {
        Cheo2 = cheo2;
    }
    //Methods

    @Override
    void Nhap() {
        System.out.print("Nhap Duong Cheo 1: ");
        Cheo1 = sc.nextInt();
        System.out.print("Nhap Duong cheo 2: ");
        Cheo2 = sc.nextInt();
    }

    
    int ChuVi() {
        TuGiac KQ = new TuGiac();
        KQ.Nhap();
        return KQ.ChuVi();
    }
    double DienTich(){
        return 0.5 * this.Cheo1 * this.Cheo2;
    }
    void Xuat(){
        System.out.println("Chu vi: " + this.ChuVi());
        System.out.println("Dien tich: " + this.DienTich());
    }
    
}
