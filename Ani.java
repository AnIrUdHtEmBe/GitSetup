package Blind75;

/*A teacher asked the class leader to prepare the list of student details (name, Roll number,
Branch and Sem) of his section by using read method and also to display the details of the
students using java program.
Q1 Demonstrate the application by creating, reading and displaying the one student of the
section using Command Line Arguments.
Q2 Demonstrate the application by creating, reading and displaying the three students of the
section using Scanner class.
Q3 Demonstrate the same application using this keyword
Requirements:
a) Create a Class called Student with given attributes(data fields)
b) Add the Method called “void Read()” to read the values of the attributes of the class student
c) Also Add the Method called “void Display()” to display the values read for the attributes
of the class student.*/
import java .util.Scanner;
class Student
{
    int rollnum , sem,i;
    String name , branch;
    void read(String name ,int rollnum,String branch,int sem )
    {
        this.name=name;
        this.rollnum=rollnum;
        this.branch=branch;
        this.sem=sem;
    }
      void read1()
    {
        this.name="ANIRUDH";
        this.rollnum=79;
        this.branch="ECE";
        this.sem=1;
    }
    void read()
        {
            
            
            System.out.println("Enter your name,roll-number,branch and sem:");
            Scanner input = new Scanner(System.in);
            name=input.nextLine();
            rollnum=input.nextInt();
            branch=input.next();
            sem=input.nextInt();
            input.close();
        }
        void display()
        {
            System.out.println("STUDENT NAME IS "+name);
            System.out.println("STUDENT ROLLNUMBER IS "+rollnum);
            System.out.println("STUDENT BRANCH IS "+branch);
            System.out.println("STUDENT SEMESTER IS "+sem);
        }
        
        
}
public class Ani 
{
    public static void main(String [] args)
    {
       Student s1 =new Student();
        for(int i=1;i<4;i++)
        {
            System.out.println("DISPLAYING DETAILS OF "+i+" STUDENT USING SCANNER CLASS");
          s1.read();
        s1.display();
        }
        
        
        
        System.out.println("USING THIS KEYWORD");
        
        
         s1.read1();
        s1.display();
        
        
        
        System.out.println("USING COMMAND LINE ARGUMENTS");
      
      
        s1.read("Ani",79,"ECE",1);
        s1.display();
        
      
    }
}
