import java.util.*;
public class Questions {
    public static void main(String[] args) {
        // Sum of two numbers:-
        int num1 = 25;
        int num2 = 42;

        int sum = num1 + num2;
        System.out.println(sum);

        // Or we can write with this also

        System.out.println("Sum : " + (num1 + num2));

        // Sum of two numbers taking input from user:-
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        int sumOfTwoNumbers = firstNumber + secondNumber;
        int productOfTwoNumbers = firstNumber * secondNumber;
        System.out.println("Sum of two Numbers : " + sumOfTwoNumbers);
        System.out.println("Product of two numbers : " + productOfTwoNumbers);

        // Area of Circle
        System.out.print("Enter Radius : ");
        float radius = sc.nextFloat();
        float area = (float) Math.PI * radius * radius;
        System.out.println("Area Of Circle : " + area);
        }
    }
}
