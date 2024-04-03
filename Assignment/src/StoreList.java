/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Admin
 */
public class StoreList extends ArrayList<Store> implements I_List {
    
@Override
public int find(String code){
    for (int i=0; i<this.size(); i++){
        if (this.get(i).getCode().equalsIgnoreCase(code))
            return i;
    }
    return -1;
}
@Override
public int findName(String name){
    for (int i=0; i<this.size(); i++){
        if (this.get(i).getName().equalsIgnoreCase(name))
            return i;
    }
    return -1;
}
// them 1 phan tu, co nhap lieu
@Override
public void add(){
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
    revenue=Double.parseDouble(sc.nextLine());
    System.out.println("A new store was added!");
    this.add(new Store(code, name, address, sales, revenue));
}

/*@Override
public void addStore(String inputString){
        Scanner sc = new Scanner(inputString);
        String delim = "[;\\s+]";
        sc.useDelimiter(delim);
        //String str[] = inputString.split("[;,]+");
        String newCode, newName, newAddress;
        String newSales, newRevenue;
        double sales, revenue;
        newCode = sc.next();
        if (!newCode.matches("^S\\d{3}$")){
            System.out.println("Invalid input!");
            return;
        }
        newName = sc.next();
        if (!newName.matches("^\\S+$")){
            System.out.println("Invalid input!");
            return;
        }
        newAddress = sc.next();
        if (!newAddress.matches("^d{3}\\S+$")){
            System.out.println("Invalid input!");
            return;
        }
        newSales = sc.next();
        //newSize = Integer.parseInt(sc.next());
        if (!newSales.matches("^\\d+$")){
            System.out.println("Invalid input!");
            return;
        }
        else {
            sales = Double.parseDouble(newSales);
        }
        newRevenue = sc.next();
        //newPrice = Integer.parseInt(sc.next());
        if (!newRevenue.matches("^\\d+$")){
            System.out.println("Invalid input!");
            return;
        }
        else {
            revenue = Double.parseDouble(newRevenue);
        }
        this.add(new Store(newCode, newName, newAddress, sales, revenue));
}*/
//tim 1 phan tu co nhap du lieu
@Override
public void search(){
    String name;
    //double salse,revenue;
    Scanner sc=new Scanner(System.in);
    System.out.print("  Input name's store:");
    name=sc.nextLine();
        if (findName(name)>=0) {
            this.output();
        }
        else {
            System.out.println("    Not found!");
        }
    
}
// xoa 1 phan tu, co nhap lieu
@Override
public void remove(){
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
public void update(){
    String code;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("  Input code: ");
        code=sc.nextLine();
    }while (find(code) < 0);
    System.out.print("  New name: ");
    this.get(find(code)).setName(sc.nextLine());
    System.out.print("  New address: ");
    this.get(find(code)).setAddress(sc.nextLine());
    System.out.print("  New sales: ");
    this.get(find(code)).setSales(Integer.parseInt(sc.nextLine()));
    System.out.print("  New revenue: ");
    this.get(find(code)).setRevenue(Integer.parseInt(sc.nextLine()));
}

// sap xep ds
@Override
public void sort(){
/*    String name;
    double sales;
    for (int i=0; i<this.size() - 1; i++){
        for (int j=(this.size() - 1); j>i; j--) {
            if (this.get(j).getName().compareTo(this.get(j-1).getName()) > 0) {
                Store tmp = this.get(j);
                this.set(j, this.get(j-1));
                this.set(j-1, tmp);
            }
            else if (this.get(j).getName().equals(this.get(j-1).getName()) == true){
                if (this.get(j).getSales() < this.get(j-1).getSales()){
                Store tmp = this.get(j);
                this.set(j, this.get(j-1));
                this.set(j-1, tmp);
                }
            }
        }
    }  */
    System.out.println("    List of store in ascending name sort and then descending salas sort: ");
    CmpByNameAndSales objComparator = new CmpByNameAndSales();
        Collections.sort(this, objComparator);        
        Collections.sort(this, new CmpByNameAndSales());
}

// xuat ds
@Override
public void output(){
    for (Store c:this)
        c.print();
}
// luu ds vao file
@Override
public void save(){
    try (FileWriter fw = new FileWriter("E:\\FPT\\2020 - Summer\\PRO192_Summer_2020\\Lab\\Assignment\\stores.txt")) {
            for (int i = 0; i < this.size(); i++) {
                fw.write("Code: " + this.get(i).getCode() + 
                          ", Name: " + this.get(i).getName() + 
                          ", Address: " + this.get(i).getAddress() + 
                          ", Sales: " + this.get(i).getSales() + 
                          ", Revenue: " + this.get(i).getRevenue() + "\r\n");
                
            }
            //fw.write("Welcome");
            fw.close();
        }
    catch (Exception e) {
        System.out.println(e);
    }
    System.out.println("Success!");
}

@Override
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

@Override
public void saveToFile () {
    if (this.size()==0) {
        System.out.println("Empty list!");
        return;
    }
    String fName = "E:\\FPT\\2020 - Summer\\PRO192_Summer_2020\\Lab\\Assignment\\stores.dat";
    try {
        FileOutputStream f = new FileOutputStream(fName);
        ObjectOutputStream f0 = new ObjectOutputStream(f);
        for (Store s: this) f0.writeObject(s);
        f0.close();
        f.close();
        
    }
    catch (Exception e) {
        System.out.println(e);
    }
}
}
