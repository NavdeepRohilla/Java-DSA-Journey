/*
Relational Operators :- Operators which are used to check the relation between operands.
1. == -- Equals to
2. != -- Not equals to
3. > -- greater than
4. < -- less than
5. >= -- Greater than equal to
6. <= -- Less than equal to


*/

import java.util.*;
public class relationalOperator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number : ");
            int num2 = sc.nextInt();

            System.out.println(num1 + " is Equals to " + num2 + " : " + (num1 == num2));
            System.out.println(num1 + " is not Equals to " + num2 + " : " + (num1 != num2));
            System.out.println(num1 + " is greater than " + num2 + " : " + (num1 > num2));
            System.out.println(num1 + " is smaller than " + num2 + " : " + (num1 < num2));
            System.out.println(num1 + " is greater than equals to " + num2 + " : " + (num1 >= num2));
            System.out.println(num1 + " is less than equal to " + num2 + " : " + (num1 <= num2));
        }
    }
}
