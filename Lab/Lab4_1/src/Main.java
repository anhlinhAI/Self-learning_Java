/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thien Nguyen
 */
public class Main {

  public static void main(String[] args)
{
    Shape tmp;
    Circle c=new Circle(10.5, "blue", false);
    System.out.println("Circle Area: " + c.getArea());
    System.out.println(c.toString());

    Rectangle r=new Rectangle(3,5, "blue", false);
    System.out.println("Rectangle Area: " + r.getArea());
    System.out.println(r.toString());
    
    Square s=new Square(6, "blue", false);
    System.out.println("Square Area: " + s.getArea());
    System.out.println(s.toString());
    tmp=s;
    
}
}

       