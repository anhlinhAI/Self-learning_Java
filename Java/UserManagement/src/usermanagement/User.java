/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

/**
 *
 * @author PC
 */
public class User {
    String userName, firstName, lastName;
    String phoneNumber, email, password;
    

    public User() {
    }

    public User(String userName, String firstName, String lastName, String phoneNumber, String email, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public void print(){
        System.out.println("User name: " + "'"+userName +"'"+ ", " + "Name: " +"'"+lastName+" "+firstName+"'"+ ", " + "Phone Number: " +"'"+ phoneNumber+"'"
        +", "+ "Email: " + "'"+email);
        System.out.println();
    
    }   
}
