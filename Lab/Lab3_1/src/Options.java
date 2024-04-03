
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
public class Options {
    SoftDrink[] arr;
    int count;
    
    public Options(){
        arr = new SoftDrink[20];
        count = 0;
    }
    
    public void Add(SoftDrink x){
        arr[count] = x;
        count++;
    }
    public int findMake(String make){
        for(int i =0 ; i<count ; i++){
            if(arr[i].getMake().equals(make)){
                System.out.println(arr[i].toString());
            }
            return i;
        }
        return -1;
    }
    
    public int findCode(String code){
        for(int i = 0 ;i<count;i++){
            if(arr[i].getCode().equals(code)){
                return i;
            }
        }
        return -1;
    }
    public void update(String code){
        float newPrice;
        Scanner sc = new Scanner(System.in);
        int pos = findCode(code);
        if(pos==-1) 
            System.out.println("Not found");
        else{
            System.out.println("Input new price:");
            newPrice= sc.nextFloat();
            arr[pos].setPrice(newPrice);
        }
    }
    
    public void sortByMake(){
        for(int i =0 ;i<count;i++){
            for(int j = i;j<count;j++ ){
                if(arr[i].getMake().compareTo(arr[j].getMake())>0){
                    SoftDrink temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        display();
    }
    
    public void display(){
        for(int i =0 ; i<count ; i++){
            System.out.println(arr[i].toString());
        }
    }
}
