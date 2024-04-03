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
public class HinhVuong extends HinhChuNhat {
     //Fields
    private int Canh;
    //Constructor
    HinhVuong(){

    }
    HinhVuong(int Canh){
        this.Canh = Canh;
    }

    public void setCanh(int canh) {
        Canh = canh;
    }
    int ChuVi(){
        return Canh * 4;
    }

   
    double DienTich() {
        return Canh * Canh;
    }

    @Override
    void Nhap() {
        System.out.print("Nhap Canh: ");
        Canh = sc.nextInt();
    }

   
    void Xuat() {
        super.Xuat();
    }
}
