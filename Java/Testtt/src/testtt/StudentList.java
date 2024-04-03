/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class StudentList extends ArrayList <Student> {
	//constructors
	public StudentList(int initialCapacity) {
		super(initialCapacity);
	}
	public StudentList() {
            super();
	}
	//methods
	public int findIDStudent(String studentID){
            for (int i=0;i<this.size();i++){
            if (studentID.matches(this.get(i).getStudentID())==true)
                return i;
            }
            return -1;
    	}
        
        public int checkEmail(String email) { 
            if (!email.matches("^\\S+[@]\\S+[.]\\S+$")){               
                return -1;
            }
            return 1;
        } 
      
        public int checkPhoneNumber (String phoneNumber) {            
            if (phoneNumber.matches("^[0]?\\d{9,11}"))
                return 1;       
            return -1;
        }
        
        final static String DATE_FORMAT = "dd-MM-yyyy";
        public static boolean checkDOB (String date) {
            try {
                DateFormat df = new SimpleDateFormat (DATE_FORMAT);
                df.setLenient(false);
                df.parse(date);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
        
	public void addStudent(){
		String studentID,firstName, lastName, gender, DOB, email, phoneNumber;
                System.out.println("---Add a new student proccess---");
                do {
		System.out.println("Enter student ID: (can be duplicated)");
        	Scanner sc = new Scanner(System.in);
        	studentID= sc.nextLine();
                } while (findIDStudent(studentID)>0);
                do {
		System.out.println("Enter first name of the student: (can not be null)");
                Scanner sc = new Scanner(System.in);
        	firstName= sc.nextLine();
                } while (firstName.length()==0); 
                do {
		System.out.println("Enter last name of the student: (can not be null)");
                Scanner sc = new Scanner(System.in);
		lastName= sc.nextLine();
                } while (lastName.length()==0);             
		do {
		System.out.println("Enter gender (male or female):");
                Scanner sc = new Scanner(System.in);
		gender= sc.nextLine();
                } while (gender.equalsIgnoreCase("male")!=true && gender.equalsIgnoreCase("female")!=true);
                do {
		System.out.println("Enter date of birth: (dd-mm-yyyy)");
                Scanner sc = new Scanner(System.in);
		DOB = sc.nextLine();
                } while (!checkDOB (DOB));
                do {
                System.out.println("Enter phone number: ");
                Scanner sc = new Scanner(System.in);
                phoneNumber = sc.nextLine();
                } while (checkPhoneNumber(phoneNumber) < 0);
		do {
                System.out.println("Enter email: ");
                Scanner sc = new Scanner(System.in);
                email = sc.nextLine();
                } while (checkEmail(email)<0);
                System.out.println("Adding a new student: Done");
		this.add(new Student(studentID,firstName,lastName,gender,DOB,email,phoneNumber));
    }			
	
        public void update() {
            String firstName, lastName, gender, DOB, email, phoneNumber;
            String studentID,choice;
            System.out.println("---Update a student proccess---");
            System.out.println("Enter the student ID:");
		Scanner sc = new Scanner(System.in);
		studentID = sc.nextLine();
            int pos = findIDStudent(studentID);
            if (pos < 0) {
                System.out.println("Student does not exist!");
                return;
            }
            else {
                System.out.println("1 - Update student");
                System.out.println("2 - Delete student");
                System.out.println("Your choice: ");
                choice = sc.nextLine();
                switch (choice) {
                case "1": {
                    System.out.println("Enter new first name:");
                    firstName = sc.nextLine();
                    System.out.println("Enter new last name:");
                    lastName = sc.nextLine();
                    System.out.println("Enter new gender:");
                    gender = sc.nextLine();
                    System.out.println("Enter new date of birth:");
                    DOB= sc.nextLine();
                    System.out.println("Enter new email:");
                    email = sc.nextLine();
                    System.out.println("Enter new phone number:");
                    phoneNumber = sc.nextLine();
                    this.get(pos).setFirstName(firstName);
                    this.get(pos).setLastName(lastName);
                    this.get(pos).setGender(gender);
                    this.get(pos).setDOB(DOB);
                    this.get(pos).setEmail(email);
                    this.get(pos).getPhoneNumber();
                    System.out.println("Updating student: Done");
                    break;
                    }
                case "2": {
                    if (this.isEmpty()){
			System.out.println("Err: List empty!");
			return;
                    }
                    String decision;
                    System.out.println("Are you sure to delete this student? Y/N");
                    decision = sc.nextLine();
                    if (decision.matches("Y")) {
                        this.remove(pos);
                        System.out.println("Done");
                    }
                    if (decision.matches("N")) {
                        System.out.println("The process of deleting was canceled!");
                    }
                    break;
                    }
                default: System.out.println("Invalid input");
                }
                }
            }

}
