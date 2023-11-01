import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author filip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println("----Part A----");
       // Person p = new Person("Caleb", "Filip", 801639666);
       //p.display();
        
      //  System.out.println("----Part B----");
        Student s1 = new Student("John", "Meyers", 900011, "CS"
        , 3.5, 75);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        
        if (s1.dropCourse("Calculus")){
            System.out.println("The class has been dropped");
        }
        else{
            System.out.println("You are not enrolled in this course. "
                    +"No courses have been dropped.");
        }
        
        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("Your are enrolled in the following courses:");
        for (String course : enrolledCourses){
            System.out.println(course);
        }           
      //  System.out.println("----Part C----");
        Student s2 = new Student("Katherin", "Johnson", 900, "CS"
        , 3.5, 72);
        Student s3 = new Student("Roy", "Clay", 901, "Biology"
        , 4.0, 98);
        Student s4 = new Student("Kimberly", "Bryant", 902, "CS"
        , 2.7, 56);
        
        Professor prof1 = new Professor("Mary", "Castro", 300, 
                    "CS", 80000);
        
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        
        prof1.display();
        
        if (prof1.removeAdvisee(902)){
            System.out.println("The advisee has been removed");   
        } else{
            System.out.println("This student is not an advisee of Professor "
            + prof1.getFirstName() + " " + prof1.getLastName());            
        }
        
        ArrayList<Student> myAdvisees = prof1.getAdvisees();
        System.out.println("Professor " + prof1.getFirstName() + " " + 
                    prof1.getLastName() + " advisees:");
        for (Student s : myAdvisees) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        
        ArrayList<Person> contactList = new ArrayList();
        contactList.add(s1);
        contactList.add(s2);
        contactList.add(s3);
        contactList.add(s4);
        contactList.add(prof1);
        
       
        
        Professor prof2 = new Professor("Frank", "Black", 801, 
                    "Math", 85000);
        contactList.add(prof2);
        
        Student s5 = new Student("Grace", "Maxeem", 903, "Psychology"
        , 3.4, 95);
        contactList.add(s5);
        
     //   System.out.println("------Part A-------");
        for (Person i : contactList){
           i.display();
        }       
     //   System.out.println("------Part B-------");
        for (Person person : contactList){
            showProfile(person, 903);
        }
        
     //   System.out.println("------Part C------");
        System.out.println("Students eligible for scholarship: ");
        for (Person person : contactList){
            if (person instanceof Student){
                if (((Student) person).getGpa() >= 3.5)
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
        System.out.println("");
        System.out.println("Professors in CS: ");
        for (Person person : contactList){
            if (person instanceof Professor){
                if (((Professor) person).getDepartment().equals("CS")){
                    System.out.println(person.getFirstName() + " " + person.getLastName());
                }
            }
        }
        //+++++++++++++++ MODULE 9 LAB
        ArrayList<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
    
        Collections.sort(students);
            
        for(Student s : students){
            System.out.println(s.getGpa());
        }
    }
    
    public static void showProfile(Person p, int id){
       if (p.getId() == id){
           p.display();
       } 
    }
    
}
