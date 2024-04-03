/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Store {
    private String code;
    private String name;
    private String address;
    private double sales, revenue;

    //constructors
    public Store() {
        this.code = "";
        this.name = "";
        this.address = "";
        this.sales = 0;
        this.revenue = 0;
    }

    public Store(String code, String name, String address, double sales, double revenue) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.sales = sales;
        this.revenue = revenue;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSales() {
        return sales;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    
    public void print() {
        System.out.println("Code: " + code + "; Name: " + name + "; Address: " +address+ "; Sales: " + sales + "; Revenue: " + revenue);
    }
}
