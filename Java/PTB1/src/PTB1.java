
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
class PTB1 {

    void NhapTS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void GiaiPT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void XuatKQ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class PTB10 {
     //Atribute
    int tsA;
    int tsB;
    int loaiNghiem;
    double gtNghiem;
    //method
    void NhapTS(){
        //java.until.Scanner.sc;
        //Scanner sc;
        //sc = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
         System.out.print("Nhap vao tham so a:");
       tsA=Integer.parseInt(sc.nextLine());
        System.out.print("NHap vao tham so b:");
       tsB=Integer.parseInt(sc.nextLine());
    }
    void GiaiPT(){
        if (tsA!=0){
            loaiNghiem= 1;     //Co mot nghiem
            gtNghiem=-tsB/tsA;
        }
        else
            if(tsB!=0)
                loaiNghiem= 0;     //vo nghiem
            else
                loaiNghiem= -1;    // vo so nghiem
    }
    void XuatKQ(){
        switch(loaiNghiem){
            case 1: 
                System.out.print("PT co mot nghiem :" + gtNghiem);    
                break;
            case 0:
                       System.out.print("PT vo nghiem");   
                break;
            case -1:
                System.out.print("PT vo so nghiem");
                break;
        }
    }
}
    
}
