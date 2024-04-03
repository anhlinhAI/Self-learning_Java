/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

/**
 *
 * @author PC
 */
public class Grade {
    Student stu = new Student();
    Subject sub = new Subject();
    double lab,test,FE;
    //boolean canDelete = true;
    
    public Grade() {
    }

    public Grade(Student stu, Subject sub, double lab, double test, double FE) {
        this.stu = stu;
        this.sub = sub;
        this.lab = lab;
        this.test = test;
        this.FE = FE;
        //this.canDelete = canDelete;
    }

    public Student getStu() {
        return stu;
    }

    public Subject getSub() {
        return sub;
    }

    public double getLab() {
        return lab;
    }

    public double getTest() {
        return test;
    }

    public double getFE() {
        return FE;
    }

    /*public boolean isCanDelete() {
        return canDelete;
    }*/
    
    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public void setFE(double FE) {
        this.FE = FE;
    }

    /*public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }*/
    
    @Override
    public String toString () { 
        return "{" + "stu=" + stu + ", sub=" + sub + ", lab=" + lab + ", test=" + test+", FE=" + FE + '}'; 
    }

    public double average() {
        return 0.3*lab + 0.2*test + 0.5*FE;
    }

}
