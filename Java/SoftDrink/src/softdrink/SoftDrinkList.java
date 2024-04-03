/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softdrink;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SoftDrinkList {
    private SoftDrink[] list=null;
    private int count=0;  //current number of SoftDrinks
    public SoftDrinkList(int size){
        if (size<10) size =10;
        list =new SoftDrink [size];
    }
 int find(String aCode){
     for (int i=0; i<count ; i++)
         if(aCode.equals(list[i].getCode())) return i;
     return -1;
    
}
 public void add(){
     if (count == list.length) System.out.println("List is full!");
     else
     { String newCode, newMake; int newVolume; float newPrice;
      // Entering new person details
      Scanner sc=new Scanner (System.in);
      int pos; // variable for existing checking for new code 
      do
      { System.out.print("Enter the SoftDrink's code: ");
        newCode = sc.nextLine().toUpperCase();
        pos=find(newCode);
        if (pos>=0) System.out.println("\t This code existed!");
      }
      while (pos>=0);
         System.out.print("Enter the SoftDrink's make: ");
         newMake=sc.nextLine();
         System.out.print("Enter the SofrDrink's volume: ");
         newVolume=Integer.parseInt(sc.nextLine());
         System.out.print("Enter the SoftDrink's price: ");
         newPrice=sc.nextFloat();
         list [count++] = new SoftDrink(newVolume, newPrice,newCode, newMake);
         System.out.println("New SoftDrink have been added.");
     }
 }
 public void update (){  //updating price only
     if(count==0)
     { System.out.println("Empty list.");
         return;
     }
 String code;
 //Entering the softdrink's code
        Scanner sc= new Scanner(System.in);
     System.out.print("Enter the code of softdrinks: ");
     code=sc.nextLine().toUpperCase();
     int pos = find (code);
     if (pos<0) System.out.println("This softdrink does not exist.");
     else
     { //Update price
         float newPrice;
         System.out.print("Enter the softdrink's price: ");
         newPrice = sc.nextFloat();
         list[pos].setPrice(newPrice);
         System.out.println("The person" + code + "was updated");
     }
    
        
 }
 public void print(){
     if(count==0)
     { System.out.println("Empty list.");
         return;
     }
     System.out.println("LIST OF SOFTDRINK: ");
     for (int i=0; i<count; i++)
         System.out.println(list[i].toString());
 }
 void sort(){
     if (count ==0) return;
     //bubble sort based on make
     for (int i=0; i<count-1; i++)
         for(int j=count-1; j>i; j--)
                if (list[j].getMake().compareTo(list[j-1].getMake())>0)
             { SoftDrink p =list[j];
               list[j]=list[j-1];
               list[j-1]=p;
                 
             }
 }
}
 class ManagingProgram {
     public static void main(String[] args) {
         Menu menu = new Menu (4);
         menu.add("Add a new softdrink ");
         menu.add("Update a softdrink");
         menu.add("List");
         menu.add("Quit");
         int choice;
         SoftDrinkList list = new SoftDrinkList(50);
         do
         { System.out.println("SoftDrink Manager");
          choice = menu.getchoice();
          switch(choice)
          { case 1: list.add(); break;
            case 2 : list.update();break;
            case 3 : list.sort(); list.print();break;
          }
         }
          while(choice>=1 && choice<4);
         
         }
     
}

