
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class StoreList extends ArrayList<Store> implements I_List {

    // tim ma cua 1 phan tu trong nhom
    @Override
    public int find(String code) { //cho nay truyen vo code
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void Search() {
        // String userName; //
       String name;
    //double salse,revenue;
    Scanner sc=new Scanner(System.in);
    System.out.print("  Input name's store:");
    name=sc.nextLine();
        if (find(name)>=0) {
            this.output();
        }
        else {
            System.out.println("    Not found!");
        }
    }

    @Override
    public void add() {
        String code;
    String name;
    String address;
    double sales;
    double revenue;
    System.out.println("Enter store details!");
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("  Input code:");
        code=sc.nextLine();
    }while (!code.matches("^S\\d{3}$") || find(code) >= 0);
    System.out.print("  Input name:");
    name=sc.nextLine();
    System.out.print("  Input address:");
    address=sc.nextLine();
    System.out.print("  Input sales:");
    sales=Double.parseDouble(sc.nextLine());
    System.out.print("  Input revenue:");
    System.out.println("A new store was added!");
    revenue=Double.parseDouble(sc.nextLine());
    this.add(new Store(code, name, address, sales, revenue));
    }

    @Override
    public void remove() {
       String code;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("  Input code: ");
        code=sc.nextLine();
        System.out.println("    Invalid input! Try again");
    }while (!code.matches("^S\\d{3}$") || find(code) < 0);
    this.remove(find(code));
    System.out.println("    Removed!");
    }

    @Override
    public void update() {
        String code;
        System.out.println("Enter code has been update: ");
        Scanner sc = new Scanner(System.in);
        code = sc.nextLine();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("Code is invalid !");
        } else {
            String newName;
            String newAddress;
            double newSales;
            double newRevenues;
            String oldCode = this.get(pos).getCode();
            String oldName = this.get(pos).getName();
            String oldAddress = this.get(pos).getAddress();
            double oldSales = this.get(pos).getSale();
            double oldRevenues = this.get(pos).getRevenues();
            System.out.println("Before update: " + "Code:" + oldCode + "Name: " + oldName + "Address: " + oldAddress + "Sales: " + oldSales + "Revenues: " + oldRevenues);
            System.out.println("Enter Name update: ");
            newName = sc.nextLine();
            System.out.println("Enter Address update: ");
            newAddress = sc.nextLine();
            System.out.println("Enter Sales update: ");
            newSales = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Revenues update: ");
            newRevenues = Double.parseDouble(sc.nextLine());
            this.get(pos).setAddress(newAddress);
            this.get(pos).setName(newName);
            this.get(pos).setRevenues(newRevenues);
            this.get(pos).setSale(oldSales);
            System.out.println("Later Update: " + "Code:" + oldCode + "Name: " + newName + "Address: " + newAddress + "Sales: " + newSales + "Revenues: " + newRevenues);
        }
        System.out.println(" ");
        return;
    }

    @Override
    public void sort() {
        System.out.println("Ascending By Name :");
        Collections.sort(this, new CmpByNameAndSale());
    }

    
  
    @Override
    public void output() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).print();
        }
        return;
    }
// luu dsach vao file

    @Override
    public void save() {
        try (FileWriter fw = new FileWriter("E:\\tien\\Warning\\PRO192//Store.txt")) {
            for (int i = 0; i < this.size(); i++) {
                fw.write("Code : " + this.get(i).getCode() + ", Name:"
                        + this.get(i).getName() + ", Address: " + this.get(i).getAddress()
                        + ", Sale: " + this.get(i).getSale() + ", Revenues: " + this.get(i).getRevenues() + "\r \n");

            }
            //fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success !");
    }
   public void loadStoreFromFile (String fName) {
    if (this.size()>0) this.clear();
    try {
        File f = new File(fName);
        if (!f.exists()) return;
        FileInputStream f1 = new FileInputStream (f);
        ObjectInputStream f0 = new ObjectInputStream (f1);
        Store s;
        while ( (s=(Store) (f0.readObject())) != null) {
            this.add(s);
    }
       f0.close();
       f1.close();
    }
    catch (Exception e) {
        System.out.println(e);
    }
}

public void saveToFile (String fName) {
    if (this.size()==0) {
        System.out.println("Empty list!");
        return;
    }
    try {
        FileOutputStream f = new FileOutputStream(fName);
        ObjectOutputStream f0 = new ObjectOutputStream(f);
        for (Store s: this) f0.writeObject(s);
        f.close();
        f0.close();
    }
    catch (Exception e) {
        System.out.println(e);
    }
}
}
