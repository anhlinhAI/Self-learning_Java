/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
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

// them 1 phan tu, co nhap lieu
@Override
public void add(){
    String code;
    String name;
    String address;
    double sales;
    double revenue;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Input code:");
        code=sc.nextLine();
    }while (find(code) >= 0);
    System.out.print("Input name:");
    name=sc.nextLine();
    System.out.print("Input address:");
    address=sc.nextLine();
    System.out.print("Input sales:");
    sales=Double.parseDouble(sc.nextLine());
    System.out.print("Input revenue:");
    revenue=Double.parseDouble(sc.nextLine());
    this.add(new Store(code, name, address, sales, revenue));
}

public void addStore(String inputString){
        Scanner sc = new Scanner(inputString);
        //String delim = "[;]";
        //sc.useDelimiter(delim);
        String str[] = inputString.split("[;,]+");
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
        if (!newAddress.matches("^\\S+$")){
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
}
//tim 1 phan tu co nhap du lieu
@Override
public void search(){
    String name,address,code;
    double salse,revenue;
    Scanner sc=new Scanner(System.in);
        System.out.print("Input name:");
        name=sc.nextLine();
    if (find(name) == 1)
        System.out.println("Found!");
    else
        System.out.println("Not found!");
    
    
}
// xoa 1 phan tu, co nhap lieu
@Override
public void remove(){
    String code;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Input code:");
        code=sc.nextLine();
    }while (find(code) < 0);
    this.remove(find(code));
    System.out.println("Removed!");
    return ;
}

@Override
public void update(){
    String code;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Input code:");
        code=sc.nextLine();
    }while (find(code) < 0);
    System.out.print("New name:");
    this.get(find(code)).setName(sc.nextLine());
    System.out.print("New address:");
    this.get(find(code)).setAddress(sc.nextLine());
    System.out.print("New sales:");
    this.get(find(code)).setSales(Integer.parseInt(sc.nextLine()));
    System.out.print("New revenue:");
    this.get(find(code)).setRevenue(Integer.parseInt(sc.nextLine()));
}

// sap xep ds
@Override
public void sort(){
    String name;
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
    }          
}

// xuat ds
@Override
public void output(){
    for (Store c:this)
        c.print();
    return ;
}
}
