package Challenge;

import java.util.Scanner;

class Course{
    static int CountmaxCapacity;
    String courseName;
    String enrolledStudent;
    String Student;
    public static int maxCapacity;


    Course(String courseName,String Student){
        this.courseName=courseName;
        this.Student=Student;
    }

    static {
        Scanner s=new Scanner(System.in);
        System.out.print("Provide Total Seats : ");
        int capacityInput=s.nextInt();
        maxCapacity=capacityInput;

        while (maxCapacity<=0) {
            System.out.println("Provide Valid Input");
            System.out.println();
            System.out.print("Provide Total Seats : ");
            capacityInput=s.nextInt();
            maxCapacity=capacityInput;
        }
        System.out.println();
        System.out.println("Maximum course Capacity Set to : "+maxCapacity);
        System.out.println();
    }
    void unenrollStudent(){   
             if (this.enrolledStudent==Student) {
            enrolledStudent=null;
            System.out.println("Student Name \""+Student+"\" UNEnrolled Successfully");
                CountmaxCapacity--;
              } else {
            System.out.println("Student Name \""+Student+"\" NOT Enrolled ");
            }   

        System.out.println();
        
        System.out.println();
        System.out.println("                    Seat Available : "+(maxCapacity-CountmaxCapacity));
        System.out.println();
       
        System.out.println();
    }

    void enrollStudent(){
        int takenMaxvalue=maxCapacity;
        if (takenMaxvalue>CountmaxCapacity) {
             if (this.enrolledStudent!=Student) {
            enrolledStudent=Student;
            System.out.println("Student Name \""+Student+"\" Enrolled Successfully");
                CountmaxCapacity++;
              } else {
            System.out.println("Student Name \""+Student+"\" Already Enrolled ");
            }
        } else {
            System.out.println("No Seat Available");
        }

        System.out.println();
        
        System.out.println();
        System.out.println("                    Seat Available : "+(maxCapacity-CountmaxCapacity));
        System.out.println();
       
        System.out.println();

    }
}

public class c52 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to RDRN course");
        System.out.println();
        Course person1=new Course("Java", "Roushan");
        Course person2=new Course("Java", "Neha");
        Course person3=new Course("Java", "Rounit");
        Course person4=new Course("Java", "Ravi");
        Course person5=new Course("Java", "Riya");
        Course person6=new Course("Java", "Khushi");
        Course person7=new Course("Java", "Ram");
        person1.enrollStudent();
        person2.enrollStudent();
        person3.enrollStudent();
        person4.enrollStudent();
        person2.unenrollStudent();
        person5.enrollStudent();
        person6.enrollStudent();
    }
}
