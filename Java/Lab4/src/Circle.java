/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Circle extends Shape {
    protected  double radius = 1.0;
   protected double Area;
   protected  double Perimeter;

    public Circle() {
    }

    public Circle(double Radius,String color, boolean filled) {
        super(color, filled);
        this.radius= radius;
        
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimeter() {
        return Perimeter;
    }
   public String toString(){
       return "Color" +  color + "Radius" + radius;
   }
   
    
}
