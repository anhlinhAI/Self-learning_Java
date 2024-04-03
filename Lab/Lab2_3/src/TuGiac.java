

import java.util.Scanner;
class TuGiac{
    //Fields
    private int Canh1;
    private int Canh2;
    private int Canh3;
    private int Canh4;
    Scanner sc = new Scanner(System.in);
    //constructor
    TuGiac(){

    }
    TuGiac(int Canh1,int Canh2,int Canh3,int Canh4){
        this.Canh1 = Canh1;
        this.Canh2 = Canh2;
        this.Canh3 = Canh3;
        this.Canh4 = Canh4;
    }
    //seters getters

    public void setCanh1(int canh1) {
        Canh1 = canh1;
    }
    public void setCanh2(int canh2) {
        Canh2 = canh2;
    }
    public void setCanh3(int canh3) {
        Canh3 = canh3;
    }
    public void setCanh4(int canh4) {
        Canh4 = canh4;
    }

    //Methods
    void Nhap(){
        System.out.println("Enter 4 sides: ");
        Canh1 = sc.nextInt();
        Canh2 = sc.nextInt();
        Canh3 = sc.nextInt();
        Canh4 = sc.nextInt();
    }
    int ChuVi(){
       return Canh1 + Canh2 + Canh3 + Canh4;
    }
    void Xuat(){
        System.out.println("Perimeter = " + this.ChuVi());
    }

}
