/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleGraphs.vertex;

import simpleGraphs.com.OrderedList;

/**
 *
 * @author PC
 */
public class Vertex implements Comparable {
    public String key ="", name="";
    public int num =0;
    public double pathLen = 0.0;
    public Vertex predecessor = null;
    public OrderedList adjList;
    public Vertex(String key){
        this.key=key; adjList = new OrderedList();
    }
    public Vertex (String key, String name){
        this.key=key; this.name=name; adjList = new OrderedList();
    }
    public int compareTo(Object t){
        return key.compareTo(((Vertex)t).key);
    }
    public String toString(){
        return "("+key+","+name+", adjs:"+adjList+")";
    }

    public OrderedList getAdjList() {
        return adjList;
    }

    public void setAdjList(OrderedList adjList) {
        this.adjList = adjList;
    }
    
}
