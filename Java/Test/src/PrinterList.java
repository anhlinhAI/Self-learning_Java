
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
public class PrinterList extends ArrayList<Printer> implements I_List {

   public int find(String ModelNumber){
       for(int i=0; i<this.size();i++){
           if(this.get(i).getModelNumber().equalsIgnoreCase(ModelNumber)){
               return i;
           }       
       }
       return -1;
    }

    @Override
    public void add() {
        String ModelNumber;
        String Type;
        double Price;
        Boolean isColor;
        String Color;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input ModelNumber:");
            ModelNumber = sc.nextLine();
        } while (!ModelNumber.matches("^PR\\d{3}") && find(ModelNumber) < 0);
        System.out.println("Input Type: ");
        Type = sc.nextLine();
        System.out.println("Input is Color or not: ");
        Color = sc.nextLine();
        if (Color.matches("true")) {
            isColor = true;
        } else {
            isColor = false;
        }
        System.out.println("Input Price: ");
        Price = Double.parseDouble(sc.nextLine());
        this.add(new Printer(ModelNumber, Type, isColor, Price));
    }
    @Override
    public void update(){
    String ModelNumber;
    String Color;
    Scanner sc= new Scanner (System.in);
    do{
        System.out.println("Input ModelNumber: ");
        ModelNumber=sc.nextLine();
    }while(find(ModelNumber)<0);
    System.out.println("Input new Type: ");
    this.get(find(ModelNumber)).setModelNumber(sc.nextLine());
    System.out.println("Input is Color or not: ");
    Color=sc.nextLine();
    if(Color.matches("true")){
        this.get(find(ModelNumber)).setIsColor(true);
    }else this.get(find(ModelNumber)).setIsColor(false);
    System.out.println("Input new Price");
    this.get(find(ModelNumber)).setPrice(Double.parseDouble(sc.nextLine()));
}
    @Override
    public void sort(){
        System.out.println("Descending: ");
        Collections.sort(this, new CmpByPriceAndType());
}
    @Override
    public void output(){
    for(int i=0; i<this.size();i++){
        this.get(i).print();
    }
}
}
