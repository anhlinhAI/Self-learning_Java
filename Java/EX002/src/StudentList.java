
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StudentList extends TreeSet<Student> {

    Scanner sc = new Scanner(System.in);

    public StudentList() {
        super();
    }

    public Student search(String ID) {
        return this.ceiling(new Student(ID));

    }

    public void searchStd() {
        System.out.println("Enter student id which need to be searched: ");
        String ID = sc.nextLine();
        Student st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("Student " + ID + " does not exist");
        } else {
            System.out.println("Found: " + st);
        }
    }

    public void addNewStd() {
        System.out.print("Enter student ID: ");
        String ID = sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student mark: ");
        int mark = Integer.parseInt(sc.nextLine());
        if (this.add(new Student(ID, name, mark))) {
            System.out.println("New student has been added successfully!");
        } else {
            System.out.println("Added failed!");
        }
    }

    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        System.out.print("Enter student id which will be updated: ");
        String ID = sc.nextLine();
        Student st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("Student " + ID + " does not exist");
            return;
        } else {
            System.out.print("Enter student name: ");
            st.setName(sc.nextLine());
            System.out.print("Enter student mark: ");
            st.setMark(Integer.parseInt(sc.nextLine()));
            System.out.println("Update student " + ID + " successfully!");
        }

    }

    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        System.out.print("Enter student id which will be deleted: ");
        String ID = sc.nextLine();
        Student st = search(ID);
        if (st == null || !st.getID().equals(ID)) {
            System.out.println("Student " + ID + " does not exist");
            return;
        } else {
            if (this.remove(st)) {
                System.out.println("Remove student " + ID + " successfully!");
            } else {
                System.out.println("Delete failed!");
            }
        }
    }

    public void output() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            Iterator it = this.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

}
