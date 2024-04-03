/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lab22 {
  private int tu;
  private int mau;

    public Lab22() {
    }

    public Lab22(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
  public void input(){
      Scanner sc= new Scanner(System.in);
      System.out.print("Nhap tu so: ");
      tu=Integer.parseInt(sc.nextLine());
      System.out.print("Nhap mau so: ");
     mau=Integer.parseInt(sc.nextLine());
         
 
  }
  public void output(){
      System.out.println("Phan so da nhap la:" + tu+"/"+mau);
  }   
  public void xuat(){
      System.out.println("Tich hai phan so la:" + tu+"/"+mau );
  }
  public void xuat1(){
      System.out.println("Cong hai phan so la:" +tu+"/"+mau);
  }
  public void xuat2(){
      System.out.println("Tru hai phan so la:" +tu+"/"+mau);
  }
  public void xuat3(){
      System.out.println("Thuong hai phan so la:"+ tu+"/"+mau);
  
  }
  int findGCD(int a, int b)
    { if (a<0)
        a=-a;
      if (b<0)
          b=-b;
      if((a==0)&&(b==0))
          return 1;
      else
          if(a!=0)
              return a;
          else
              if(b!=0)
                  return b;
      while(a!=b)
          if(a>b)
              a-=b;
          else 
              b-=a;
      return a;
    }
    private void simplify(){
        int g=findGCD(this.tu, this.mau);
        this.tu /= g;
        this.tu = this.mau/g;
        }
  
  public Lab22 tich(Lab22 ps1){
      Lab22 kq1= new Lab22();
      kq1.tu= this.tu*ps1.tu;
      kq1.mau=this.mau*ps1.mau;
      return kq1;
  }
  public Lab22 chia(Lab22 ps2){
      Lab22 kq2=new Lab22();
      kq2.tu=this.tu*ps2.mau;
      kq2.mau=this.mau*ps2.tu;
      return kq2;
  }
  public Lab22 cong(Lab22 ps3){
      Lab22 kq3=new Lab22();
      kq3.tu=this.tu*ps3.mau+ps3.tu*this.mau;
      kq3.mau=this.mau*ps3.mau;
      return kq3;
  }
  public Lab22 tru(Lab22 ps4){
      Lab22 kq4=new Lab22();
      kq4.tu=this.tu*ps4.mau-ps4.tu*this.mau;
      kq4.mau=this.mau*ps4.mau;
      return kq4;
  }
    public static void main(String[] args) {
        Lab22 obj=new Lab22();
        Lab22 obj1=new Lab22();
        obj.input();
        obj.output();
        obj1.input();
        obj1.output();
      Lab22 kqc= obj.cong(obj1);
       Lab22 kqt= obj.tru(obj1);
       Lab22 kqn= obj.tich(obj1);
       Lab22 kqch= obj.chia(obj1);
        kqc.xuat1();
        kqt.xuat2();
        kqn.xuat();
        kqch.xuat3();
        
        
    }
  
  }

