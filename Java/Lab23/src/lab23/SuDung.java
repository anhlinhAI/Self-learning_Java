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
public class SuDung {
    public static void main(String args[]) {
        HinhVuong a = new HinhVuong();
        System.out.println("- Hinh Vuong:");
        a.Nhap();
        a.Xuat();
        HinhChuNhat b= new HinhChuNhat();
        System.out.println("- Hinh Chu Nhat");
        b.Nhap();
        b.Xuat();
    }
    
}
