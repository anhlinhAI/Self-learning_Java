/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Rectangle extends Shape{
   protected double width = 1.0;
   protected double length = 1.0;
   protected double Area;
   protected double Perimeter;

    public Rectangle() {
    }
    public Rectangle(double width, double length){
        
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width= width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimeter() {
        return Perimeter;
    }
    public String toString(){
        return "Color" + color + "filled" + filled + "width" + width + "length" + length ;
    }
   
    
    
    
    
}
