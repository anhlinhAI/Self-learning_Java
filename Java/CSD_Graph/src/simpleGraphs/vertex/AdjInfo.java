/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleGraphs.vertex;

/**
 *
 * @author PC
 */
public class AdjInfo implements Comparable<AdjInfo> {
    public Vertex dest;
    public double weight=1;
    public AdjInfo(Vertex dest){
        this.dest=dest;
    }
    public AdjInfo(Vertex dest, double weight){
        this.dest=dest;
        this.weight=weight;
    }
    public int compareTo(AdjInfo t){
        return dest.compareTo(t.dest);
    }
    public String toString(){
        return "(" + dest.key+"," + weight +")";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
