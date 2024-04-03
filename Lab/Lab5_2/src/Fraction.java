
import java.io.ObjectStreamConstants;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Fraction implements IMyNumber{ 
    //Data fields
    private int numerator;
    private int denominator;
    Scanner sc = new Scanner(System.in);
    
    //Constructors
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    
    public Fraction(int numerator)
    {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public int getNumerator(){          
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //Getters, Setters
    public void setDenominator(int denominator) {    
        this.denominator = denominator;
    }

    //do by yourself
    //Methods
    int greatCommonDivisor(int a, int b) {
        int r;
        if (a<0)  a=-a;
        if (b<0)  b=-b;
        
        if (b==0)
            if (a!=0)
                r = a;
            else
                r = 1;
        else //b<>0
            if (a==0)
                r = b;
            else
                while (a!=b)
                    if (a>b)
                        a-=b;
                    else
                        b-=a;
        r = a;
        
        return r;
    }
    
    private void simplify(){
        int t = greatCommonDivisor(this.numerator, this.denominator);
        this.numerator = this.numerator / t;
        this.denominator /= t;
    }
    
    public void Input()
    {
        do{
            System.out.println("Enter a numerator: ");
            this.numerator = Integer.parseInt(sc.nextLine());
            System.out.println("Enter a denimirator: ");
            this.denominator = Integer.parseInt(sc.nextLine());
        }while(this.denominator == 0);
    }

    public void Output(){
        if(this.denominator == 1){
            System.out.println("Fraction: " + this.numerator);
        }
        else{
           System.out.println("Fraction:"+this.numerator+"/"+this.denominator);
    }}
    
    @Override
    public IMyNumber add(IMyNumber other) {
        IMyNumber result;
        int n, d;
        
        n = this.numerator*((Fraction)other).denominator + this.denominator*((Fraction)other).numerator;
        d = this.denominator*((Fraction)other).denominator;
        result = new Fraction(n, d);
        return result;
    }
    
    @Override
    public IMyNumber sub(IMyNumber other) {
        IMyNumber result;
        int n,d;
        n = this.numerator*((Fraction)other).denominator - this.denominator*((Fraction)other).numerator;
        d = this.denominator*((Fraction)other).denominator;
        result = new Fraction(n,d);
        return result;
    }
    
    @Override
    public IMyNumber mul(IMyNumber other) {
        IMyNumber result;
        int n,d;
        n = this.numerator*((Fraction)other).numerator;
        d = this.denominator*((Fraction)other).denominator;
        result = new Fraction(n,d);
        return result;
    }
    
    @Override
    public IMyNumber div(IMyNumber other) {
        IMyNumber result;
        int n,d;
        if(((Fraction)other).denominator != 0){
        n = this.numerator*((Fraction)other).denominator;
        d = this.denominator*((Fraction)other).numerator;
        result = new Fraction(n,d);
        return result;
        }
        else{
            System.out.println("Can not divide!");
            result = new Fraction(numerator, denominator);
            return result;
        }
    }
}
