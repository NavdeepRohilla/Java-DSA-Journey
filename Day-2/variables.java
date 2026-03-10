// Variables in Java
/* 
In Java, variables are containers used to store data in memory. Variables define how data is stored, accessed, and manipulated.

A variable in Java has three components,

Data Type: Defines the kind of data stored (e.g., int, String, float).
Variable Name: A unique identifier following Java naming rules.
Value: The actual data assigned to the variable.
*/
public class variables {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        String name = "Navdeep Rohilla";
        System.out.println("First Name : %s" + name);

        a = b;
        System.out.println(a);
    }
}
