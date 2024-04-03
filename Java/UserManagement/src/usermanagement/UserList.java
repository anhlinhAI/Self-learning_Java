/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class UserList extends ArrayList<User> {

    private static final String FILENAME = "C:\\\\Users\\\\PC\\\\Desktop\\\\LAB//User.txt";

    public int find(String userName) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getUserName().equalsIgnoreCase(userName)) {
                return i;
            }
        }
        return -1;
    }

    public int findFirstName(String firstName) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                return i;
            }
        }
        return -1;
    }

    public int findLastName(String lastName) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getLastName().equalsIgnoreCase(lastName)) {
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

    public int checkPass(String pass) {
        if (pass.matches("^[0-9]*?\\d$")) {
            return 1;
        } else {
            System.out.println(" Error: Password invalid !  ");
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

    public String Encrypt(String pass) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pass.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Encryption failed!");
            return null;
        }
    }

    public void createAccount() {
        String userName, firstName, lastName;
        String phoneNumber, email, pass;
        String confirm;

        Scanner sc = new Scanner(System.in);
        System.out.println("_______ & Create Account & ______");
        do {
            System.out.print("- Please input user name: ");
            userName = sc.nextLine();
            if (find(userName) >= 0) {
                System.out.println("--- User name has been existed! ---");
            } else if (userName.length() < 5) {
                System.out.println("Error: User name has at least five character: ");

            }

        } while (find(userName) >= 0 || userName.length() == 0 || userName.length() < 5);
        do {
            System.out.print("- Please input first name of student: ");
            firstName = sc.nextLine();
        } while (!(checkValidName(firstName)) || firstName.length() == 0);
        do {
            System.out.print("- Please input last name of student: ");
            lastName = sc.nextLine();
        } while (!(checkValidName(lastName)) || lastName.length() == 0);
        do {
            System.out.print("- Please input phone number (10-12 nunber): ");
            phoneNumber = sc.nextLine();
        } while (checkValidPhoneNumber(phoneNumber) < 0 || phoneNumber.length() == 0);
        do {
            System.out.print("- Please input email: ");
            email = sc.nextLine();

        } while ((!checkEmail(email)) || (email.length() == 0));
        do {
            System.out.print("- Please input password: ");
            pass = sc.nextLine();
            if (pass.length() == 0) {
                System.out.println("Error: Password can not blank!");
            } else if (pass.length() < 6) {
                System.out.println("Error: Password has at least six character!");
            }
        } while (pass.length() < 6 || pass.length() == 0 || checkPass(pass) < 0);
        do {
            System.out.print("- Please confirm password: ");
            confirm = sc.nextLine();

            if (!confirm.equalsIgnoreCase(pass)) {
                System.out.println("Error: Confirm password incorrect! ");
            } else if (confirm.length() == 0) {
                System.out.println("Error : Confirm password can not blank!");
            }
        } while (!confirm.equalsIgnoreCase(pass) || confirm.length() == 0 || checkPass(confirm) < 0);
        pass = confirm = Encrypt(pass);
        System.out.println("--- Create account success ---");
        System.out.println("");
        this.add(new User(userName, firstName, lastName, phoneNumber, email, pass));

    }

    public void removeAccount() {
        String userName, pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("_______ & Remove Account & ______");
        System.out.print("- Please input user name: ");
        userName = sc.nextLine();
        System.out.print("- Please input password: ");
        pass = sc.nextLine();
        pass = Encrypt(pass);
        if (find(userName) < 0 || userName.length() == 0) {
            System.out.println("Error: User non existed!");
            System.out.println();

        } else if (!(this.get(find(userName)).getPassword().equalsIgnoreCase(pass))) {
            System.out.println("Error : Password incorrect!");
        } else {
            String decision;
            System.out.println("--- User founded ! ---");
            System.out.print("Are you sure to delete this student ? (Y/N)");
            decision = sc.nextLine().toUpperCase();
            if (decision.matches("Y")) {
                this.remove(find(userName));
                System.out.println("--- Delete success ---");
            }
            if (decision.matches("N")) {
                System.out.println("--- The process of deleting was canceled! ---");
                System.out.println();
            }
        }
    }

    public void updateUser() {
        String userName, pass;
        String firstName = "", lastName = "";
        String email = "", phoneNumber = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("_______ & Update Account & ______");
        System.out.print("- Please input user name: ");
        userName = sc.nextLine();
        System.out.print("- Please input password: ");
        pass = sc.nextLine();
        pass = Encrypt(pass);
        try {
            if (find(userName) < 0 || userName.length() == 0) {
                System.out.println("Error: User non existed!");
                System.out.println();

            } else if (!(this.get(find(userName)).getPassword().equalsIgnoreCase(pass))) {
                System.out.println("Error : Password incorrect!");
            } else {
                do {
                    System.out.print(" - Please input new first name: ");
                    firstName = sc.nextLine();
                } while (!(checkValidName(firstName)));
                do {
                    System.out.print(" - Please input new last name: ");
                    lastName = sc.nextLine();
                } while (!(checkValidName(lastName)));
                do {
                    System.out.print("- Please input new phone number (0xxxxxxxxx): ");
                    phoneNumber = sc.nextLine();
                    if (phoneNumber.length() == 0) {
                        System.out.println("--- Phone number not change --- ");
                        break;
                    }
                } while (checkValidPhoneNumber(phoneNumber) < 0);
                do {
                    System.out.print("- Please input new email: ");
                    email = sc.nextLine();
                    if (email.length() == 0) {
                        System.out.println("--- Email not change ---");
                        break;
                    }
                } while ((!checkEmail(email)));
                do {
                    System.out.print("- Please input new password: ");
                    pass = sc.nextLine();

                    if (pass.length() == 0) {
                        System.out.println("--- Password has not change ---");
                        break;
                    } else if (pass.length() < 6) {
                        System.out.println("Error: Password has at least six character!");
                    }
                } while (pass.length() < 6 || pass.length() == 0);
                pass = Encrypt(pass);
                if (firstName.length() > 0) {
                    this.get(find(userName)).setFirstName(firstName);
                }
                if (lastName.length() > 0) {
                    this.get(find(userName)).setLastName(lastName);
                }
                if (email.length() > 0) {
                    this.get(find(userName)).setEmail(email);
                }
                if (phoneNumber.length() > 0) {
                    this.get(find(userName)).setPhoneNumber(phoneNumber);
                }
                if (pass.length() > 0) {
                    this.get(find(userName)).setPassword(pass);
                }
                System.out.println(" --- Update Successfull! ---");
                System.out.println();
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public void searchAccount() {

        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("_______ & Search Account & ______");
        System.out.print("- Please input name to search :");
        name = sc.nextLine();
        if (name.length() == 0) {
            System.out.println("Error: Input invalid !");
        } else if (findLastName(name) < 0 && findFirstName(name) < 0) {
            System.out.println("--- User Non existed! ---");
        } else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getFirstName().equalsIgnoreCase(name)) {
                    this.get(i).print();
                }
                if (this.get(i).getLastName().equalsIgnoreCase(name)) {
                    this.get(i).print();
                }
            }
        }
    }

    public void writeFile() {
        File f = new File(FILENAME);

        if (!f.exists()) {
            //file.createNewFile();
            System.out.println("File not existed");
        }
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(f.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            for (User x : this) {
                String data = "User name: " + "'" + x.getUserName() + "'" + ", Name:"
                        + "'" + x.getLastName() + " " + x.getFirstName() + "'" + ", Email: " + "'" + x.getEmail() + "'"
                        + ", Phone number: " + "'" + x.getPhoneNumber() + "'" + ", Password: " + "'" + x.getPassword() + "'" + "\r \n";

                // true = append file
                bw.write(data);
                System.out.println("--- Success! ---");
            }
         
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void printFile() {

        try {
            File f = new File(FILENAME);
            Scanner reader = new Scanner(f);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("--- List is Empty! ---");

        }

    }

}
