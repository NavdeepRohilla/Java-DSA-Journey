/*
Polymorphism:- Polymorphism is the ability of an object to take on many forms.

Types of Polymorphism:
1. Compile Time Polymorphism: Method Overloading
2. Run Time Polymorphism: Method Overriding

method Overloading:- Multiple methods with the same name but different parameters.

Method Overriding :- Parent and child class both contain same function with different definition.



*/


// ------------------------------- Method Overloading --------------------------------------

public class Polymorphism {
    public static void main(String[] args) {
        
        // method overloading

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(10, 20));
        // System.out.println(calc.sum(10, 20, 30));
        // System.out.println(calc.sum(10.5f, 20.5f));
        // System.out.println(calc.sum(10.5, 20.5));

        // method overriding

        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();

        animal = dog;
        animal.eat();


    }
}

// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
//     float sum(float a, float b) {
//         return a + b;
//     }
//     double sum(double a, double b) {
//         return a + b;
//     }
// }


// ------------------------------- Method Overriding --------------------------------------

class Animal {
    void eat() {
        System.out.println("Eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Eats bones");
    }
}