
import java.util.Comparator;


/**
 *
 * @author TaiNT
 */
//public class Student {
public class Student implements Comparable<Student> {
    //attributes
    private String code;
    private String name;
    private double score;
    
    //contructors
    public Student() {
        this.code = "";
        this.name = "";
        this.score = 0;
    }
    public Student(String code, String name, double score) {
        this.code = code;
        this.name = name;
        this.score = score;
    }
    //getters, setters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    //other methods
    public void print(){
        System.out.println("Code:"+code+" Name:"+name+" Score:"+ score);
    }
    
    //use Comparable interface
    public int compareTo(Student s){        
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
                if (this.score > s.score )
                    return 1;
                else
                    if (this.score < s.score)
                        return -1;
                    else
                        return 0;
        
    }
    
    //use comparator interface and anonymous class    
    public static Comparator objCmpByScore = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        
        if (s1.score > s2.score )
            return 1;
        else
            if (s1.score < s2.score)
                return -1;
            else
                return 0;
        }
    };
    
    //using Generic: no need casting
    public static Comparator objCmpByCode = new Comparator<Student>(){
        @Override
        public int compare(Student s1, Student s2) {
        
        if (s1.getCode().compareTo(s2.getCode()) > 0)
            return 1;
        else
            if (s1.getCode().compareTo(s2.getCode()) < 0)
                return -1;
            else
                return 0;
        }
    };
    
    public static Comparator objCmp2 = new Comparator<Student>(){
        @Override
        public int compare(Student s1, Student s2) {
        
        if (s1.getName().compareTo(s2.getName()) > 0)
            return 1;
        else
            if (s1.getName().compareTo(s2.getName()) < 0)
                return -1;
            else
                if (s1.getScore()>s2.getScore())
                    return 1;
                else
                    if (s1.getScore()<s2.getScore())
                        return -1;
                    else
                        return 0;
        }
    };

}
