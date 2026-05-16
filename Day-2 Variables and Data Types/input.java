/*
Input in Java:-

next -- Used when we have to take input of one Word.
nextLine -- Used when we have to take input of group of words , sentence etc.
nextInt -- Used when we have to take input of a number.
nextByte -- Used when we have to take input of byte no.
nextFloat -- Used when we have to take input of floating value
nextDouble -- Used when we have to take input of a decimal value.
nextBoolean -- Used when we have to take input true or false
nextShort -- Used when we have to take input of a short number
nextLong -- Used when we have to take input of very long number

*/

import java.util.*;
public class input {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter First Name : ");
        String firstName = sc.nextLine();
        System.out.println("First Name : " + firstName);


        System.out.print("Enter Full Name : ");
        String fullName = sc.nextLine();
        System.out.println("Full Name : " + fullName);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Age : " + age);

        System.out.print("User is Used Instagram : ");
        boolean isUsedInstagram = sc.nextBoolean();
        System.out.println(isUsedInstagram);

        System.out.print("Enter Percentage out of 100 : ");
        float percentage = sc.nextFloat();
        System.out.println("Percentage : " + percentage);

        System.out.println("My name is " + fullName + " . I am " + age +  " years old. I obtained " + percentage +" percent in my boards exam");
        }
    }
}
