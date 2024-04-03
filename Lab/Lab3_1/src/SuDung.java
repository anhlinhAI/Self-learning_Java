
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lorca
 */
public class SuDung {
    public static int printMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n***************************************************************");
        System.out.println("\n1.Add a softdrink:");
        System.out.println("\n2.Find softdrinks of a manufacturer:");
        System.out.println("\n3.Update the price of a softdrink using its code:");
        System.out.println("\n4.List all products using ascending order of manufacturers :");
        System.out.println("\nChoice:");
        int choice;
        choice= sc.nextInt();
        return choice;
    }
    
    public static void main(String[] args) {
        int choice= 0 ;
        Scanner sc = new Scanner(System.in);
        Options obj = new Options();
        do{
            choice = printMenu();
            switch(choice){
                case 1 :
                    String code , make;
                    int volume;
                    float money;
                    System.out.println("Input code:");
                    sc = new Scanner(System.in);
                    code = sc.nextLine();
                    System.out.println("Input manufacturer: ");
                    sc = new Scanner(System.in);
                    make = sc.nextLine();
                    System.out.println("Input volume: ");
                    volume = sc.nextInt();
                    System.out.println("Input money: ");
                    money = sc.nextFloat();
                    SoftDrink x = new SoftDrink(code, make, volume, money);
                    obj.Add(x);
                break;
                
                case 2 : String findMake;
                    System.out.println("Input the manufacturer: ");
                    findMake  = sc.nextLine();
                    if(obj.findMake(findMake)==-1){
                        System.out.println("Not found!");
                    }
                break;
                
                case 3:String updateCode;
                    System.out.println("Input code:");
                    sc = new Scanner(System.in);
                    updateCode = sc.nextLine();
                    obj.update(updateCode);
                break;
                
                case 4 : 
                    obj.sortByMake();
                break;
            }
        }
        while(choice>=1&&choice<=4);
    }
}

