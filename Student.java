import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author filip
 */
public class Student extends Person implements Comparable<Student>{
    String major;
    double gpa;
    int credits;
    double balance;
    boolean transfer;
    ArrayList<String> enrolledCourses;
    
    public Student(String fName, String lName, int id, String major,
            double gpa, int credits){
        super(fName, lName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        balance = 0;
        enrolledCourses = new ArrayList();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isTransfer() {
        return transfer;
    }
    
    public void setTransfer(boolean transfer){
        this.transfer = transfer;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }
    
    public void addCourse(String Course){
       enrolledCourses.add(Course);
    }
    
    public boolean dropCourse(String Course){
        if (enrolledCourses.contains(Course)){
            enrolledCourses.remove(Course);
            return true;
        } 
        else{
            return false;
        }
   
    }
    
    @Override
    public void display(){
        System.out.println("Name: " + this.getFirstName() +
                " " + this.getLastName() + "\tID: " + this.getId());
    }

    @Override
    public int compareTo(Student o) {
        double sGPA = this.getGpa();
        double oGPA = o.getGpa();     
        System.out.println("Students GPA: " + sGPA+ " and " + oGPA );
        if (sGPA > oGPA){
            return 1;
        }
        if (sGPA < oGPA){
            return -1;
        }
        else {
            return 0;
        }
    }

    
}
