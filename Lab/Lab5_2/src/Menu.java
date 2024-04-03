
import java.util.Scanner;
import java.util.ArrayList;

//public class Menu extends ArrayOfString {
public class Menu extends ArrayList<String>{

    public Menu() {
        super();
    }
    
    public Menu (int size){
        super(size);
    }

    // add a hint
    @Override
    public boolean add (String aHint) {  
        return super.add(aHint);
        //this.add(aHint);
    }

    // get user choice
    public int getChoice() { 
        int result=0;
        if (this.size()>0){ 
            // print out hints
            for (int i=0; i<this.size(); i++)
                System.out.println( (i+1) + "-" + this.get(i));
          
            System.out.print("Please select an operation: ");
            Scanner sc= new Scanner(System.in);
            result= Integer.parseInt(sc.nextLine());// get user choice
        }
        return result;
      }
    }
