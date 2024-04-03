/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class Employee implements Comparable<Employee> {
    //attributes
    private String code;
    private String name;
    private String dob;
    private int salary;
    
    //contructors
    public Employee() {
        this.code = "";
        this.name = "";
        this.dob = "";
        this.salary = 0;
    }
    public Employee(String code, String name, String dob, int salary) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }
    //getters, setters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void setSalary(int Salary) {
        this.salary = salary;
    }
    
    //other methods
    public void print(){
        System.out.println("Code:"+code+" Name:"+name+" Date of birth:"+ dob +" Salary:"+salary);
    }
    
    //use Comparable interface
    public int compareTo(Employee s){        
        /*if (this.score > s.score )
            return 1;
        else
            if (this.score < s.score)
                return -1;
            else
        */
                
        if (this.getName().compareTo(s.getName()) > 0)
            return 1;
        else
            if (this.getName().compareTo(s.getName()) < 0)
                return -1;
            else
                if (this.salary > s.salary )
                    return 1;
                else
                    if (this.salary < s.salary)
                        return -1;
                    else
                        return 0;
        
    }
    
    //use comparator interface and anonymous class    
    public static Comparator objCmpByScore = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        
        if (e1.salary > e2.salary) 
            return 1;
        else
            if (e1.salary < e2.salary)
                return -1;
            else
                return 0;
        }
    };
    
    //using Generic: no need casting
    public static Comparator objCmpByCode = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2) {
        
        if (e1.getCode().compareTo(e2.getCode()) > 0)
            return 1;
        else
            if (e1.getCode().compareTo(e2.getCode()) < 0)
                return -1;
            else
                return 0;
        }
    };
    
    public static Comparator objCmp2 = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2) {
        
        if (e1.getName().compareTo(e2.getName()) > 0)
            return 1;
        else
            if (e1.getName().compareTo(e2.getName()) < 0)
                return -1;
            else
                if (e1.getSalary()>e2.getSalary())
                    return 1;
                else
                    if (e1.getSalary()<e2.getSalary())
                        return -1;
                    else
                        return 0;
        }
    };

}
