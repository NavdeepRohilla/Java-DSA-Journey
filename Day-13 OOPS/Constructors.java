/*
Constructors:- Constructors is a special method which is invoked automatically at the time of object cration
- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void)
- Constructors are only called once, at object creation
- Memory allocation happens when constructor  is called.

Types of Constructors:
1. Non-Parameterized Constructor: A constructor that does not take any parameters. It is used to initialize objects with default values.

2. Parameterized Constructor: A constructor that takes parameters to initialize an object with specific values at the time of creation.

3. Copy Constructor: A constructor that creates a new object as a copy of an existing object. It is used to create a new object with the same values as an existing


Constructor Overloading:- When a class has more than one constructor with different parameter lists, it is called constructor overloading. This allows for different ways to initialize objects of the class.

Shallow Copy vs Deep Copy in Copy Constructors:
- Shallow Copy: In a shallow copy, the copy constructor copies the values of the fields of the original object to the new object. If the fields are primitive types, this works fine. However, if the fields are reference types (like arrays or objects), both the original and the new object will reference the same memory location. This means that changes to the reference type fields in one object will affect the other object, which can lead to unintended side effects.

lazy copy constructor is a shallow copy constructor.


Destructors- A destructor is a special method that is automatically called when an object is destroyed or goes out of scope. It is used to perform cleanup operations, such as releasing resources or memory that the object may have acquired during its lifetime. In Java, there are no explicit destructors like in C++, but the garbage collector handles memory management and cleanup of objects that are no longer in use.

*/


public class Constructors {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Navdeep";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 90;

        for(int i=0; i<3; i++) {
            System.out.println(s1.marks[i]);
        }

        Student s2 = new Student("Ananya");
        System.out.println(s2.name);

        Student s3 = new Student(123);
        System.out.println(s3.roll);

        Student s4 = new Student(s1);
        s4.password = "xyz";
        s1.marks[0] = 50; // changing marks of s1 should not change marks of s4 if we have implemented deep copy constructor

        for(int i=0; i<3; i++) {
            System.out.println(s4.marks[i]);
        }
        
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    // Shallow Copy Constructor 
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student (Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll= s1.roll;
        for (int i = 0; i <marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    // -----------Non Parameterized Constructor---------------

    Student() {
        marks = new int[3];
        System.out.println("Constructor called");
    }

    // ------------------- Parameterized Constuctor-------------

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }    

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}
