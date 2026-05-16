/*
Arithmetic Operators :- There are two types of arithmetic operators: Binary and Unary . 

1. Binary Operators :- These Operators have two operands .
- '+' -- Addition
- '-' -- Subtraction
- '*' -- Multiplication
- '/' -- Division
- '%' -- Modulo (Remainder)

2. Unary Operators :- These are the operators which operates on the one Operand.
- '++' :- Pre Increment (++a) Post Increment (a++)

- '--' :- Pre Decrement (--a) & Post Decrement (a--)
*/

import java.util.*;
public class arthmeticOperators {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number 1 : ");
            int num1 = sc.nextInt();

            System.out.print("Enter number 2 : ");
            int num2 = sc.nextInt();

            // Binary Operators :-

            System.out.println("Addition : " + (num1+num2));
            System.out.println("Subtraction : " + (num1 - num2));
            System.out.println("Multiplication : " + (num1 * num2));
            System.out.println("Division : " + (num1/num2));
            System.out.println("Remainder : " + (num1 % num2));
            
            // Unary Operators :-
            // Pre & Post Increment:-
            System.out.println("Pre-Increment : " + ++num1);
            System.out.println("Post-Increment : " + num1++);

            // Pre & Post Decrement:-
            System.out.println("Pre-Decrement : " + --num1);
            System.out.println("Post-Decrement : " + num1--);
        }
    }
}
