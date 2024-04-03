
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Store  {
    //data fields
    String code;
    private String address;
    private String name;
    private double sale;
    private double revenues;

    public Store(String code, String address, String name, Double sale, Double revenues) {
        this.code = code;
        this.address = address;
        this.name = name;
        this.sale = sale;
        this.revenues = revenues;
    }

    public Store() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double  sale) {
        this.sale = sale;
    }

    public double getRevenues() {
        return revenues;
    }
    public void setRevenues(double  revenues) {
        this.revenues = revenues;
    }
    public void print (){
     System.out.println("Code: " + code + "  Name: " + name + "  Address: " + address + "  Sale: " + sale + "  Revenues: " + revenues);
        //System.out.printf("Code: S%s; Name: %s; Address: %s; Sale: %.0f; Revenues: %.0f\n",code,name,address,sale,revenues);
    }
}