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
public class Student {
     //data fileds
      String studentID;
      String firstName;
      String lastName;
      String gender;
      String DOB;
      String email;
      String phoneNumber;
    
    //conductor
    public Student (){
        this.studentID = "";
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.phoneNumber = "";
        this.gender = "";
        this.DOB = "";
    }
    
    public Student(String studentID, String firstName, String lastName, String gender, String DOB, String email, String phoneNumber) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DOB = DOB;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    
    
    //getter,setter

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) return;
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) return;
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        if (gender == null) return;
        this.gender = gender;
    }

    public void setDOB(String DOB) {
        if (DOB == null) return;
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        if (email == null) return;
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) return;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", DOB=" + DOB + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
    }
}
