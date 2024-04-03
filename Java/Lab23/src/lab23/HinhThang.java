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
public class HinhThang extends TuGiac {
     private int DayLon;
    private int DayBe;
    private int Canh1;
    private int Canh2;
    //constructor
    HinhThang(){
    }
    HinhThang(int DayLon,int DayBe,int Canh1,int Canh2){
        super(DayLon,DayBe,Canh1,Canh2);
        this.DayLon = DayLon;
        this.DayBe = DayBe;
        this.Canh1 =Canh1;
        this.Canh2 = Canh2;
    }
    //setter getter

    public void setDayLon(int dayLon) {
        this.DayLon = dayLon;
    }

    public void setDayBe(int dayBe) {
        this.DayBe = dayBe;
    }

    
    public void setCanh1(int canh1) {
        this.Canh1 = canh1;
    }

    
    public void setCanh2(int canh2) {
        this.Canh2 = canh2;
    }
    //methods

    
    void Nhap() {
        System.out.print("Nhap Day Lon: ");
        DayLon = sc.nextInt();
        System.out.print("Nhap Day Be: ");
        DayBe = sc.nextInt();
        System.out.print("Nhap 2 canh ben: ");
        Canh1 = sc.nextInt();
        Canh2 = sc.nextInt();
    }
    void Xuat() {
        TuGiac KQ = new TuGiac(DayLon,DayBe,Canh1,Canh2);
        KQ.Xuat();
    }
    
}
