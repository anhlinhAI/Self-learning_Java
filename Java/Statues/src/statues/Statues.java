/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statues;

/**
 *
 * @author PC
 */
public class Statues implements Comparable{

    String ID, author;
    double height, weight;


    public Statues(String ID, String author, double height, double weight) {
        this.ID = ID;
        this.author = author;
        this.height = height;
        this.weight = weight;
    }

    Statues(String ID) {
       this.ID =ID;
    }
    
    public int compareTo(Object o) {
        return ID.compareTo(((Statues) o).ID);
    }
    public String toString(){
        return "ID: " + ID + ", author: " + author + ". height: " + height + ", weight: " + weight;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
