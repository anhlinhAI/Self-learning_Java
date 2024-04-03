
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
public class PTB1 {
      //Atributes //data fields
    private int tsA;
    private int tsB;
    private int loaiNghiem;
    private double gtNghiem;
    public void setTsA(int tsA){
        this.tsA=tsA;
 
    }

    //Method
    public void setTsB(int tsB) {
        this.tsB = tsB;
    }

    //Setters
    void GantsA(int thamSoA) {
        tsA=thamSoA;
    }
    void GantsB(int thamSoB){
        tsB=thamSoB;
    }
    
    void NhapTS(){   
        //java.util.Scanner sc;
       // Scanner sc;
       // sc = new Scanner(System.in);
       Scanner sc= new Scanner(System.in);
       System.out.print("Nhap vao tham so a:");
       tsA=Integer.parseInt(sc.nextLine());
       
       System.out.print("NHap vao tham so b:");
       tsB=Integer.parseInt(sc.nextLine());
    }
    void GiaiPT(){
        if (tsA!=0){
            loaiNghiem= 1;     //Co mot nghiem
          //  gtNghiem=-1.0*tsB/tsA; //implicit casting (khong tuong minh)
          gtNghiem=(double)tsB/tsA; //explicit casting 
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
    

