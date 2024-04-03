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
public class Subject {
//data flieds

    String subjectID, subjectName;
    private int credit;

    //conductors
    public Subject() {
        this.subjectID = "";
        this.subjectName = "";
        this.credit = 0;
    }

    public Subject(String subjectID, String subjectName, int credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = credit;
    }
    //getter setter

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public void setSubjectName(String subjectName) {
        if (subjectName == null) {
            return;
        }
        this.subjectName = subjectName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", credit=" + credit + '}';
    }

}
