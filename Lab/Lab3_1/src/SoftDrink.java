/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lorca
 */
public class SoftDrink {
    private String code="", make="";
    private int volume=0;
    private float price=0;
    
    public SoftDrink(){
        code = "";
        make = "";
        volume = 0;
        price = 0.0f;
    }
    
    public SoftDrink(String code, String make, int volume, float price){
        this.code = code;
        this.make = make;
        this.price = price;
        this.volume = volume;
        }
    
    //Setter

    public void setCode(String code) {
        this.code = code;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    //Getter
    public String getCode() {
        return code;
    }

    public String getMake() {
        return make;
    }

    public int getVolume() {
        return volume;
    }

    public float getPrice() {
        return price;
    }
    public String toString(){
        return"Code: " + code +", manufacturer:" +make +", volume: " +volume +", price: " +price;
    }
}
