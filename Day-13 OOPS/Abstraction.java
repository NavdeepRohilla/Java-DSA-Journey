/*
Abstraction:- Hiding all the unnecessary details and showing only the necessary details to the user.

Types of Abstraction:

1. Abstract Class: A class that is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its object cannot be created.

2. Interface: An interface is a collection of abstract methods that are declared using the interface keyword. It is used to achieve abstraction and multiple inheritance.
*/

// ------------------------------- Abstract Class --------------------------------------

/*

- Cannot create an instance of an abstract class.
- can have abstract and non-abstract methods.
- can have constructors.
- can have static methods.
- can have final methods.
- can have final variables.
- can have static final variables.
- can have static final methods.
- can have static final variables.

*/

public class Abstraction {
    public static void main(String[] args) {

    //     Horse horse = new Horse();
    //     horse.eat();
    //     horse.walk();
    //     System.out.println(horse.color);
    //     horse.changeColor("red");
    //     System.out.println(horse.color);

    //     Chicken chicken = new Chicken();
    //     chicken.eat();
    //     chicken.walk();
    //     System.out.println(chicken.color);
    //     chicken.changeColor("red");
    //     System.out.println(chicken.color);


    Mustang mustang = new Mustang();
    // Animal -> Horse -> Mustang
    mustang.eat();
    mustang.walk();
    System.out.println(mustang.color);
    mustang.changeColor("red");
    System.out.println(mustang.color);
    }
}

abstract class Animal {
    String color;

    // constructor
    Animal() {
        System.out.println("Creating a animal");
        color = "brown";
    }

    // non-abstract method
    void eat() {
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Creating a horse");
    }
    void changeColor(String color) {
        color = "dark" + color;
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Creating a mustang");
    }
}


class Chicken extends Animal {

    Chicken() {
        System.out.println("Creating a chicken");
    }

    void changeColor(String color) {
        color = "white" + color;
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

