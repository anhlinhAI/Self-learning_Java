/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class CharCounter extends HashMap<Integer, Integer> {
    int numOfChars = 0;
    public CharCounter(){
        super();
    }
    public CharCounter(String filename){
        super();
        try{
            FileReader fr = new FileReader (filename);
            int code;
            while ((code = fr.read())!= -1){
                if(!this.containsKey(code))this.put(code, 1);
                else this.replace(code, this.get(code)+1);
            }
            fr.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void print(){
        for (Integer cObj:this.keySet()){
            System.out.println((char)cObj.intValue()+", "+ this.get(cObj)+", "+1.0*this.get(cObj)/numOfChars);
        }
    }
    public static void main(String[] args) {
        CharCounter counter = new CharCounter("laychong.txt");
        counter.print();
    }
}
