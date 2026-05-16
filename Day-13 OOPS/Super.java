/*
Super Keyword in Java is used to refer to the immediate parent class object. It can be used to access methods and variables of the parent class. It is also used to invoke the parent class constructor

- to access parent's properties
- to access parent's methods
- to access parent's constructor

*/


public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("I am an animal");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calls the constructor of the parent class (Animal)
        System.out.println("I am a horse");
    }
}