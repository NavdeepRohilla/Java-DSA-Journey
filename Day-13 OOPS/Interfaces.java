/*
Interfaces:- An interface is a collection of abstract methods that are declared using the interface keyword. It is used to achieve abstraction and multiple inheritance.

- Interface is a blueprint of a class.
- Interface is a collection of abstract methods.
- Interface is a collection of constants.
- Interface is a collection of static methods.
- Interface is a collection of default methods.
- Interface is a collection of private methods.
- Interface is a collection of protected methods.
- Interface is a collection of public methods.

Interfaces are used to achieve multiple inheritance.

Types of Interfaces:
1. Normal Interface: A normal interface is an interface that contains only abstract methods.
2. Functional Interface: A functional interface is an interface that contains only one abstract method. 

- all methods are public, abstract, & without implementation.
- Used to achieve total abstraction
- Variables in the interface are final, public and static


*/

// --------- Multiple Inheritance using Interfaces --------------------------------------

public class Interfaces {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down,left, right, diagonal (ina all directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right and diagonal()");
    }
}