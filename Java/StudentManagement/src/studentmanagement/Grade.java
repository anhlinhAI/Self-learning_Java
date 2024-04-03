/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author PC
 */
public class Grade {

    Student st = new Student();
    Subject sub = new Subject();
    double lab, test, FE;

    public Grade(Student st, Subject sub, double lab, double test, double FE) {
        this.st = st;
        this.sub = sub;
        this.lab = lab;
        this.test = test;
        this.FE = FE;
    }

    public Grade() {

    }

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public double getLab() {
        return lab;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public double getFE() {
        return FE;
    }

    public void setFE(double FE) {
        this.FE = FE;
    }

    public void print() {
        System.out.println("Student: " + st);
        System.out.println("Subject: " + sub);
        System.out.println("Test: " + test);
        System.out.println("Final exam: " + FE);
        System.out.println("LAB: " + lab);
    }

    public double average() {
        return 0.3 * lab + 0.2 * test + 0.5 * FE;
    }
}
