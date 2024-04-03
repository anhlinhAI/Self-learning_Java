/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Printer {
    String ModelNumber;
    String Type;
    Boolean isColor;
    double Price;

    public Printer() {
    }

    public Printer(String ModelNumber, String Type, Boolean isColor, double Price) {
        this.ModelNumber = ModelNumber;
        this.Type = Type;
        this.isColor = isColor;
        this.Price = Price;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Boolean getIsColor() {
        return isColor;
    }

    public void setIsColor(Boolean isColor) {
        this.isColor = isColor;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    public void print(){
        System.out.println("ModelNumber: " + ModelNumber + "Type: " + Type + "isColor"+ isColor + "Price:" + Price);
    }
}
