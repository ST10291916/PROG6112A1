/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

import java.util.Scanner;


public class Student {
   private int studentID;
   private String name;
   int age;
   private String email;
   private String course;

public void captureStudent(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student ID : ");
    studentID = scanner.nextInt();
    System.out.println("Enter name: ");
    name = scanner.nextLine();
    System.out.println("Enter age: ");
    age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter email: ");
    email = scanner.nextLine();
    System.out.println("Enter course: ");
    course = scanner.nextLine();
    }
public boolean searchStudent(int searchID){
     return studentID == searchID;
  }
  public void deleteStudent(int deleteID){
      if (studentID == deleteID){
          studentID = 0;
          name = "";
          age = 0;
          email = "";
          course = "";
          System.out.println("Student deleted successfully.");
      }else{
          System.out.println("Student not found.");
      }
}
  public void printStudentReport(){
      System.out.println("Student ID: " + studentID);
      System.out.println("Name: " + name);
      System.out.println("Age: "+age);
      System.out.println("Email: "+email);
      System.out.println("Course: "+course);
  }
}


