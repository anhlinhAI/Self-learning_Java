
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> implements I_Menu {
    public Menu(){
        super();
    }
    public void addItem (String s){
        this.add(s);
        return;
    }
    public int getChoice(){
        int result;
        for (String s:this)
            System.out.println(s);
        Scanner sc= new Scanner (System.in);
        result = Integer.parseInt (sc.nextLine()); 
        return result;
    
}
}
