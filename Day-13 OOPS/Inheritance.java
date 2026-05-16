/*
Inheritance : Inheritance is when properties & methods of base class are passed on a derived class.

------------------Advantages of Inheritance:----------------

1. Code Reusability: Inheritance allows you to reuse code from existing classes, which can save time and effort when creating new classes. You can create a new class that inherits the properties and methods of an existing class, and then add new features or modify existing ones as needed.

2. Method Overriding: Inheritance allows you to override methods in the base class with new implementations in the derived class. This can be useful when you want to provide a specific implementation for a method that is already defined in the base class.

3. Polymorphism: Inheritance enables polymorphism, which allows you to treat objects of different classes as if they were of the same type. This can simplify code and make it more flexible, as you can use a common interface to interact with objects of different classes.

4. Improved Code Organization: Inheritance can help improve code organization by allowing you to group related classes together in a hierarchy. This can make it easier to understand the relationships between classes and how they interact with each other.

5. Easier Maintenance: Inheritance can make it easier to maintain code, as changes made to the base class will automatically be reflected in the derived classes. This can save time and effort when making updates or fixing bugs in the code.

Types of Inheritance:
1. Single Inheritance: A class inherits from one base class.
2. Multilevel Inheritance: A class inherits from a derived class, which in turn inherits from a base class.
3. Hierarchical Inheritance: Multiple classes inherit from a single base class.
4. Multiple Inheritance: A class inherits from multiple base classes. (Not supported in Java, but can be achieved using interfaces)




*/

// public class Inheritance {

//     public static void main(String[] args) {
//         Dog tommy = new Dog();
//         tommy.eat();
//         tommy.legs = 4;
//         System.out.println(tommy.legs);
//     }
// }

// ------------------------------- Single Inheritance --------------------------------------


// Base Class
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("Breathes");
//     }
// }



// // Derived Class  / Subclass
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims in water");
//     }
// }

// ----------------------------------- Multilevel Inheritance ------------------------------

// Base Class
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("Breathes");
//     }
// }



// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }






// ---------------------------- Hierarichal Inheritance --------------------------------------

// Base Class
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("Breathes");
//     }
// }

// class Mammals extends Animal {
//     void walk() {
//         System.out.println("Walks");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swims");
//     }
// }

// class Birds extends Animal {
//     void fly() {
//         System.out.println("Fly");
//     }
// }


// ------------------------------- Multiple Inheritance --------------------------------------

// ------------------------------- Multiple Inheritance --------------------------------------

// Base Class
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("Eats");
//     }
// }

// class Mammals extends Animal {
//     void walk() {
//         System.out.println("Walks");
//     }
// }

// class Dog extends Mammals {
//     String breed;
// }

// class Cat extends Mammals {
//     String breed;
// }

// class Reptile extends Animal {
//     String breed;
// }   

// class Crocodile extends Reptile {
//     String breed;
// }

// class Snake extends Reptile {
//     String breed;
// }

// class Bird extends Animal {
//     String breed;
// }

// class Parrot extends Bird {
//     String breed;
// }

// class Penguin extends Bird {
//     String breed;
// }

// ----------------------------------- Hybrid Inheritance --------------------------------------

// class Animal {
//     String color;
//     void eat() {
//         System.out.println("Eats");
//     }
// }

// class Mammals extends Animal {
//     int legs;
//     void walk() {
//         System.out.println("Walks");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swims");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("Fly");
//     }
// }

// // Java allows only one class after extends (use implements for extra behavior)
// class Dog extends Mammals {
//     String breed;
// }

// class Cat extends Mammals {
//     String breed;
// }

// class Parrot extends Bird {
//     String breed;
// }

// class Penguin extends Bird {
//     String breed;
// }

// class Reptile extends Animal {
//     String breed;
// }

// class Crocodile extends Reptile {
//     String breed;
// }

// class Snake extends Reptile {
//     String breed;
// }