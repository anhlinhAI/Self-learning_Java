/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lab21 {
    private double CD;
    private double CR;
    private double chuVi;
    private double dienTich;

    public Lab21(double CD, double CR) {
        this.CD = CD;
        this.CR = CR;
    }

    public Lab21() {
    }

    public double getCD() {
        return CD;
    }

    public void setCD(double CD) {
        this.CD = CD;
    }

    public double getCR() {
        return CR;
    }

    public void setCR(double CR) {
        this.CR = CR;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        CD= sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        CR= sc.nextDouble();
    }
    public void output(){
        System.out.println("Chieu dai :" + CD);
        System.out.println("Chieu rong:" + CR);
        System.out.println("Chu vi:" + (CD+CR)*2);
        System.out.println("Dien tich:" + CD*CR);
    }
    
}
