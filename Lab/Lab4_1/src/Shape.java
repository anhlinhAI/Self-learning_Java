/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thien Nguyen
 */
public class Shape {

//Declaring instance variables

private String color;

private boolean filled;

//Zero argumented constructor

public Shape() {

this.color = "red";

this.filled = true;

}

// getters and setters

public String getColor() {

return color;

}

public void setColor(String color) {

this.color = color;

}

public boolean isFilled() {

return filled;

}

public void setFilled(boolean filled) {

this.filled = filled;

}

//Parameterized constructor

public Shape(String color, boolean filled) {

this.color = color;

this.filled = filled;

}

//toString method is used to display the contents of an object inside it

@Override

public String toString() {

return "A Shape with color of "+color+" and "+filled;

}

} 
