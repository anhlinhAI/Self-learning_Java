/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thien Nguyen
 */
public class Rectangle extends Shape{
 //Declaring instance variables

private double width;

private double length;

//Zero argumented constructor

public Rectangle()

{

this.length=1.0;

this.width=1.0;

}

//Parameterized constructor

public Rectangle(double width, double length) {

this.width = width;

this.length = length;

}

//Parameterized constructor

public Rectangle(double width, double length, String color, boolean filled) {

super(color, filled);

this.width = width;

this.length = length;

}
//getters and setters

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

//This method will calculate the area of the Rectangle

public double getArea()

{

return length*width;

}

//This method will calculate the Perimeter of the Rectangle

public double getPerimeter()

{

return 2*(length+width);

}

//toString method is used to display the contents of an object inside it

@Override

public String toString() {

return "A Rectangle with width = "+getWidth()+" and length = "+getLength()+" which is a subclass of "+super.toString();

}

}
