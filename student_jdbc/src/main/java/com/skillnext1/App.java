package com.skillnext1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        StudentDao sd=new StudentDao();
        while(true)
        {
            System.out.println("Welcome to Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("Enter your choice:");

            int choice=sc.nextInt();
            switch(choice)
            {   
                case 1:
                {
                    System.out.println("Enter name");
                    String name=sc.next();
                    System.out.println("Enter email");
                    String email=sc.next();
                    System.out.println("Enter dept");
                    String dept=sc.next();
                    student stu=new student(name,email,dept);
                    try{
                        sd.addStudent(stu);
                        System.out.println("Student added successfully");
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                }
                case 2:
                {
                    try{
                        for(student s:sd.getAllStudents())
                        {
                            System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail()+" "+s.getDept());
                        }
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter student id to delete:");
                    int id=sc.nextInt();
                    try{
                        if(sd.exists(id))
                        {
                            System.out.println("Student with id "+id+" does not exist");
                            break;
                        }
                        sd.deleteStudent(id);
                        System.out.println("Student deleted successfully");
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Enter id,name,email,dept to update:");
                    int id=sc.nextInt();
                    String name=sc.next();
                    String email=sc.next();
                    String dept=sc.next();
                    student stu=new student(name,email,dept);
                    stu.setId(id);
                    try{
                        sd.updateStudent(stu);
                        System.out.println("Student updated successfully");
                    }catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
        }
    }
        
    }
}
