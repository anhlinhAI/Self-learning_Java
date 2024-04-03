/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class SuDung {
    public static void main(String[] argv){
        PTB1 oPt1, oPt2, oPt3;
        
        oPt1=new PTB1();
        oPt2=new PTB1();
        
        oPt1.NhapTS();
        oPt1.GiaiPT();
        oPt1.XuatKQ();
        
        oPt2.NhapTS();
        oPt2.GiaiPT();
        oPt2.XuatKQ();
        
        oPt3=oPt2;
    }
    
}
