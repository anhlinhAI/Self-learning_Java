/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thien Nguyen
 */
public class Circle extends Shape {
    private double radius;

public Circle() {

this.radius = 1.0;

}

public Circle(double radius) {

this.radius = radius;

}

public Circle(double radius,String color, boolean filled) {

super(color, filled);

this.radius = radius;

}

public double getArea()

{

return Math.PI*radius*radius;

}

public double getPerimter()

{

return 2*Math.PI*radius;

}

@Override

public String toString() {

return "A Circle with radius "+radius+" which is a subclass of "+super.toString();

}

}
 
