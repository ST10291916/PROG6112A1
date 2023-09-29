/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Student[] students = new Student[100];
    int studentCount = 0;
    
    while(true){
        System.out.println("Please select one of the few menu items: ");
        System.out.println("(1) Capture a new student");
        System.out.println("(2) Search for a student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print student report");
        System.out.println("(5) Exit Application");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        //calls the method from the Student class and then checks if the age is correct
        if (choice == 1){
            if (studentCount < students.length){
                Student student = new Student();
                student.captureStudent();
                if (student.age > 16){
                    System.out.println("Please enter a valid age.");
                }else{
                    students[studentCount] = student;
                    studentCount++;
                    System.out.println("Student captured successfully");
                }
                //enter the student ID to look for a student
            }else if (choice == 2){
                    System.out.println("Enter student ID to search: ");
                    int searchID = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < studentCount; i++){
                        students[i].searchStudent(searchID);
                    }
                    //enter the student ID of the student you want to delete
                    }else if (choice == 3){
                    System.out.println("Enter student ID to delete: ");
                    int deleteID = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < studentCount; i++){
                        students[i].deleteStudent(deleteID);
                }
                    }else if (choice == 4){
                     for (int i = 0; i < studentCount; i++){
                         students[i].printStudentReport();
                         System.out.println();
                     }   
                    }else if (choice == 5){
                        System.out.println("Exiting application.....");
                        break;
                    }else{
                        System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    }
}
