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
public class Student {
    private String stID;
    private String lastName, firstName, Gender, DOB;
    private String phoneNumber, Email;
    boolean canDelete =true;

    public Student(String stID, String lastName, String firstName, String Gender, String DOB, String phoneNumber, String Email) {
        this.stID = stID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.Gender = Gender;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        
    }

    public Student() {
    }



    public String getstID() {
        return stID;
    }

    public void setstID(String stID) {
        this.stID = stID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void print(){
        System.out.println("Student ID: " + stID);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender: " + Gender);
        System.out.println("Email: " + Email);
        System.out.println("Date Of Birth: " + DOB);
    
    }   
}
