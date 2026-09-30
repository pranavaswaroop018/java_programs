class Student{

    String name;
    int rollNumber;
    String branch;

    Student(String name, int rollNumber, String branch){
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
    }


    void Display(){
       
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);

    }
}


public class studentmanagement{

    public static void main (String[] args){


        Student s1 = new Student ("Rahul",102,"ECE");


        s1.Display();

        System.out.println();

        Student s2 = new Student ("Priya", 103,"CSE");

       
        s2.Display();



                                 
    }
}