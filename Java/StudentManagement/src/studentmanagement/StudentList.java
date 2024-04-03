/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class StudentList extends ArrayList<Student> {

    public int find(String stID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getstID().equalsIgnoreCase(stID)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkValidName(String name) {
        String regex = "^[a-zA-Z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("  ---- Name valid---- ");
            return true;
        } else {
            System.out.println("  ---- Name invalid! ----");
            System.out.println("  * Note: Name does not contain number and blank: ");
            return false;
        }
    }

    public int checkValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[0-9]*?\\d{10,12}$")) {
            return 1;
        } else {
            System.out.println("  ---- Phone number invalid!  ---- ");
            return -1;
        }
    }

    public static boolean checkEmail(String email) {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("  ---- Email valid ---- ");
            return true;
        } else {
            System.out.println("  ---- Email invalid! ----");
            System.out.println("  * Note: Please input email according this example : tientaminh287@gmail.com  ");
            return false;
        }
    }
    final static String DATE_FORMAT = "dd-MM-yyyy";

    public static boolean checkDOB(String DOB) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(DOB);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public void addStudent() {
        String stID, firstName, lastName, gender;
        String phoneNumber, Email, DOB;

        Scanner sc = new Scanner(System.in);

        System.out.println("_______ & Add Student Function & ______");
        do {
            System.out.print("Please input student ID: ");
            stID = sc.nextLine().trim();
            if (find(stID) >= 0) {
                System.out.println("--- ID student has been existed! ----");
            }
        } while (find(stID) >= 0 || stID.length() == 0);
        do {
            System.out.print("Please input first name of student: ");
            firstName = sc.nextLine();
        } while (!(checkValidName(firstName)) || firstName.length() == 0);
        do {
            System.out.print("Please input last name of student: ");
            lastName = sc.nextLine();
        } while (!(checkValidName(lastName)) || lastName.length() == 0);
        do {
            System.out.print(" Please input gender (Male or female):");
            gender = sc.nextLine().toUpperCase();
        } while ((gender.equalsIgnoreCase("MALE") != true && gender.equalsIgnoreCase("FEMALE") != true));
        do {
            System.out.print("Please input phone number (0xxxxxxxxx): ");
            phoneNumber = sc.nextLine();
        } while (checkValidPhoneNumber(phoneNumber) < 0 || phoneNumber.length() == 0);
        do {
            System.out.print(" - Please input email: ");
            Email = sc.nextLine();

        } while ((!checkEmail(Email)) || (Email.length() == 0));
        do {
            System.out.print(" - Please input Date of Birth (dd-mm-yyyy): ");
            DOB = sc.nextLine();

        } while ((!checkDOB(DOB)) || (DOB.length() == 0));

        System.out.println("--- Student has been added --- ");
        System.out.println();
        this.add(new Student(stID, lastName, firstName, gender, DOB, phoneNumber, Email));

    }

    public void updateStudent() {
        String stID;
        String firstName = null, lastName = null, Gender = "", Email = "", phoneNumber = "", DOB = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("_______ & Update Student Function & ______");

        System.out.print(" - Please input student ID for update: ");
        stID = sc.nextLine().trim();
        try {
            if (find(stID) < 0) {
                System.out.println("Student does not existed !");

                if (stID.length() == 0) {
                    System.out.println("--- Student information does not change! ---");
                }
            } else {
                do {
                    System.out.print(" - Please input new first name: ");
                    firstName = sc.nextLine().trim();
                } while (!(checkValidName(firstName)));
                do {
                    System.out.print(" - Please input new last name: ");
                    lastName = sc.nextLine().trim();
                } while (!(checkValidName(lastName)));
                do {
                    System.out.print(" - Please input new Gender (Male or Female): ");
                    Gender = sc.nextLine();
                    if (Gender.length() == 0) {
                        System.out.println("--- Gender not change! ---");
                        break;
                    }
                } while ((Gender.equalsIgnoreCase("MALE") != true && Gender.equalsIgnoreCase("FEMALE") != true) && ((Gender.length() == 0) != true));

                do {
                    System.out.print(" - Please input new email: ");
                    Email = sc.nextLine().trim();
                    if (Email.length() == 0) {
                        System.out.println("--- Email not change ---");
                        break;
                    }
                } while (!checkEmail(Email) || Email.length() == 0);

                do {
                    System.out.print(" - Please input new phone number (0xxxxxxxxx): ");
                    phoneNumber = sc.nextLine().trim();
                    if (phoneNumber.length() == 0) {
                        System.out.println("--- Phone number not change --- ");
                        break;
                    }
                } while (checkValidPhoneNumber(phoneNumber) < 0 || phoneNumber.length() == 0);
                do {
                    System.out.print(" - Please input new Date of Birth (dd-mm-yyy) : ");
                    DOB = sc.nextLine();
                    if (DOB.length() == 0) {
                        System.out.println("--- Date of Birth not change! ---");
                        break;
                    }
                } while ((!checkDOB(DOB)) || DOB.length() == 0);
                if (firstName.length() > 0) {
                    this.get(find(stID)).setFirstName(firstName);
                }
                if (lastName.length() > 0) {
                    this.get(find(stID)).setLastName(lastName);
                }
                if (Gender.length() > 0) {
                    this.get(find(stID)).setGender(Gender);
                }
                if (phoneNumber.length() > 0) {
                    this.get(find(stID)).setPhoneNumber(phoneNumber);
                }
                if (DOB.length() > 0) {
                    this.get(find(stID)).setDOB(DOB);
                }
                if (Email.length() > 0) {
                    this.get(find(stID)).setEmail(Email);
                }
                System.out.println(" --- Update Successfull! ---");
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e) {

        }

    }

    public void removeStudent() {
        String stID;
        Scanner sc = new Scanner(System.in);

        System.out.println("_______ & Delete Student Function & ______");

        System.out.print(" - Please input student ID for Delete: ");
        stID = sc.nextLine().trim();
        if (find(stID) < 0 || stID.length() == 0) {
            System.out.println("Student does not existed !");
            System.out.println();
        } else {
            String decision;
            System.out.println("ID Student is found !");
            System.out.print("Are you sure to delete this student ? (Y/N)");
            decision = sc.nextLine().toUpperCase();
            if (decision.matches("Y")) {
                this.remove(find(stID));
                System.out.println("--- Delete successfully! ---");
            }
            else if (decision.matches("N")) {
                System.out.println("--- The process of deleting was canceled! ---");
                System.out.println();
            }
        }
    }

    public static boolean checkContinue(String decision) {
        String regex = "^[Y,N]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(decision);
        if (matcher.find()) {
            return true;
        } else {
            System.out.print(" Input invalid , Please enter 'Y' or 'N'");
        }
        return false;
    }

}
