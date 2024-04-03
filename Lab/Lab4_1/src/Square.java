/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thien Nguyen
 */
public class Square extends Rectangle{
    //Zero argumented constructor

public Square()

{

}

//Parameterized constructor

public Square(double side)

{

super(side,side);

}

//Parameterized constructor

public Square(double side,String color, boolean filled) {

super(side, side, color, filled);

}

// getters and setters

public void setWidth(double side)

{

setWidth(side);

}

public void setLength(double side)

{

setLength(side);

}

public void setSide(double side)

{

setLength(side);

}



//This method will calculate the area of the Square

@Override

public double getArea()

{

return getLength()*getWidth();

}

//This method will calculate the Perimeter of the Square

@Override

public double getPerimeter()

{

return 4*getLength();

}

//toString method is used to display the contents of an object inside it

@Override

public String toString() {

return "A Square with side = "+getLength()+" which is a subclass of "+super.toString();

}

}
   
