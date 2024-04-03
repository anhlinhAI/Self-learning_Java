/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Square extends Rectangle {
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }
    public Square(double side, String color, boolean filled){
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

public String toString(){
    return "Side" + side;
}   
    
}
