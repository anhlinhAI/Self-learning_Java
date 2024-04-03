/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Sudung {
    public static void main(String[] argv){
        //TamGiac otg1 =new TamGiac();
        //TamGiac aTG[];
        
        //aTG= new TamGiac[5];
        //aTG[0]=new TamGiac(3,4,5);
        //aTG[0].getCanhA();
        
        DaGiac aDG[];
        aDG=new DaGiac[5];
        aDG[0]=new DaGiac(3);
        aDG[1]=new TamGiac(3,4,5);
        
        aDG[0].TinhDT();
        aDG[1].TinhDT();
        
    }
}
