/*
Packages:- Packages are used to organize classes into a namespace.

Types of Packages:
1. Built-in Packages: Packages that are provided by the Java language.
2. User-defined Packages: Packages that are created by the user.
*/

// ------------------------- Built-in package example --------------------------------------
import java.util.Scanner;   // built-in: java.util

// ------------------------- User-defined package example --------------------------------
import models.Student;      // user-defined: models (folder models/Student.java)

public class Packages {
    public static void main(String[] args) {
        // Using built-in package (java.util)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Using user-defined package (models)
        Student s1 = new Student();
        s1.name = name;
        s1.rollNo = 101;

        System.out.println("Hello " + s1.name + ", roll no: " + s1.rollNo);
        sc.close();
    }
}
