
import java.util.Scanner;
/*
Logical Operators  ;- Logical operators are the operators which perform some logical operations like true false.
- && (Logical And)
- || (Logical Or)
- ! (Logical Not)
*/
public class logicalOperator {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
        // Logicl And (&&)
        int age = sc.nextInt();
        System.out.println("Age is between 18 and 45 : " + ( age >=18 && age <= 45));

        // Logical Or (||)
        System.out.println("Eligible for special entry: " + (age < 18 || age > 60));

        // Logical Not (!)
        System.out.println(!(age<18));
    }
   }
}
