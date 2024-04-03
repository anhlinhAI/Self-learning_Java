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
public class HinhChuNhat extends HinhThoi {
    //Fields
    private int ChieuDai;
    private int ChieuRong;
    //Constructors
    HinhChuNhat(){

    }
    HinhChuNhat(int ChieuDai,int ChieuRong){
        this.ChieuRong = ChieuRong;
        this.ChieuDai = ChieuDai;
    }
    public void setChieuDai(int chieuDai) {
        ChieuDai = chieuDai;
    }
    public void setChieuRong(int chieuRong) {
        ChieuRong = chieuRong;
    }
    // Methods
    void Nhap() {
        System.out.print("Nhap Chieu Dai: ");
        ChieuDai = sc.nextInt();
        System.out.print("Nhap Chieu Rong: ");
        ChieuRong = sc.nextInt();
    }
    int ChuVi() {
        return (ChieuDai + ChieuRong) * 2;}
    double DienTich() {
        return ChieuDai * ChieuRong;}
    void Xuat() {
        super.Xuat();
    }
}
