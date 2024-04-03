/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class ClockList extends ArrayList<Clock> implements I_List {

// tim ma cua 1 phan tu trong nhom
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
    String make;
    int size;
    int price;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Input code:");
        code=sc.nextLine();
    }while (find(code) >= 0);
    System.out.print("Input make:");
    make=sc.nextLine();
    System.out.print("Input size:");
    size=Integer.parseInt(sc.nextLine());
    System.out.print("Input price:");
    price=Integer.parseInt(sc.nextLine());
    this.add(new Clock(code, make, size, price));
}
public void addClock(String inputString){
        Scanner sc = new Scanner(inputString);
        String delim = "[;\\s]+";
        sc.useDelimiter(delim);
        String newCode, newMake;
        String newSize, newPrice;
        int size, price;
        newCode = sc.next();
        if (!newCode.matches("^C\\d{3}$")){
            System.out.println("Invalid input!");
            return;
        }
        newMake = sc.next();
        if (!newMake.matches("^\\S+$")){
            System.out.println("Invalid input!");
            return;
        }
        newSize = sc.next();
        //newSize = Integer.parseInt(sc.next());
        if (!newSize.matches("^\\d+$")){
            System.out.println("Invalid input!");
            return;
        }
        else {
            size = Integer.parseInt(newSize);
        }
        newPrice = sc.next();
        //newPrice = Integer.parseInt(sc.next());
        if (!newSize.matches("^\\d+$")){
            System.out.println("Invalid input!");
            return;
        }
        else {
            price = Integer.parseInt(newPrice);
        }
        this.add(new Clock(newCode, newMake, size, price));
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

// update 1 phan tu co nhap lieu
@Override
public void update(){
    String code;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.print("Input code:");
        code=sc.nextLine();
    }while (find(code) < 0);
    System.out.print("New make:");
    this.get(find(code)).setMake(sc.nextLine());
    System.out.print("New size:");
    this.get(find(code)).setSize(Integer.parseInt(sc.nextLine()));
    System.out.print("New price:");
    this.get(find(code)).setPrice(Integer.parseInt(sc.nextLine()));
}

// sap xep ds
@Override
public void sort(){
    for (int i=0; i<this.size() - 1; i++){
        for (int j=(this.size() - 1); j>i; j--) {
            if (this.get(j).getPrice()<this.get(j-1).getPrice()) {
                Clock tmp = this.get(j);
                this.set(j, this.get(j-1));
                this.set(j-1, tmp);
            }
            else if (this.get(j).getPrice() == this.get(j-1).getPrice()){
                if (this.get(j).getSize() < this.get(j-1).getSize()){
                Clock tmp = this.get(j);
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
    for (Clock c:this)
        c.print();
    return ;
}
}

    