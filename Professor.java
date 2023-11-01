
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author filip
 */
public class Professor extends Person {
    String department;
    double salary;
    ArrayList<Student> advisees;
    
    public Professor(String fName, String lName, int id,
            String department, double salary){
        super(fName, lName, id);
        this.department = department;
        this.salary = salary;
        advisees = new ArrayList();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }

    public void addAdvisee(Student student){
        advisees.add(student);
    }
    
    public boolean removeAdvisee(int id){
        for (Student student: advisees){
            if (student.getId() == id){
                advisees.remove(student);
                return true;
            } 
        }
        return false;
    }
    
    @Override
    public void display(){
        System.out.println("new lab");
        System.out.println("Name: " + this.getFirstName() +
                " " + this.getLastName() + "\tID: " + this.getId());
        System.out.println("Department: " + department + "\tSalary:  $" + 
                salary);
    }
        
}
