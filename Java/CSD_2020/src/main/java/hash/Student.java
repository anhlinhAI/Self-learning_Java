/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Student implements Comparable {
    String code, name;
    int mark;
    Scanner sc = new Scanner (System.in);

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase().trim();
        this.name = name.toUpperCase().trim();
        this.mark = mark;
    }
    public String toString(){
        return code + ","+name+","+mark;
    }
    public int compareTo(Object t){
        return code.compareTo(((Student)t).code);
    }
    public void update(){
        String newName;
        String newMarkStr;
        System.out.println("New name, ENTER for bypassing:");
        newName = sc.nextLine().trim().toUpperCase();
        if(newName.length()>0) this.name= newName;
        System.out.println("New mark, ENTER for bypassing:");
        newMarkStr = sc.nextLine().trim();
        if(newMarkStr.length()>0) this.mark=Integer.parseInt(newMarkStr);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
}
