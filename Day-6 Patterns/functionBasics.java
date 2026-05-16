




public class functionBasics {

    // Function to print Hello World
    public static void printHelloWorld() {
        System.out.println("Hello Ananya!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // Calculate sum of two numbers
    public static void calculateSum(int firstNumber , int secondNumber) { // Parameters or Formal Parameters

        // ********************* BAD PRACTICE*********************
        // We should take input from user in our main function not in the functions which we made.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number : ");
        // int firstNumber = sc.nextInt();

        // System.out.print("Enter Second Number : ");
        // int secondnumber = sc.nextInt();

        // int sum = firstNumber + secondnumber;
        // System.out.println("Sum : " + sum);


        // ********************GOOD PRACTICE**********************
        // This is how we should take input from user from main thread not from the function we made

        int sum = firstNumber + secondNumber;
        System.out.println("Sum : " + sum);
    }

    // Swapping
    public static void swapTwonumbers(int num1 , int num2 ){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
    }

    // Multiply of two numbers
    public static int multiplyTwoNumbers(int a , int b) {
        int product = a *b;
        
        return product;
    }

    // Factorial of a number
    public static int factorialOfNumber(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Binomial Coefficient
    public static int binomialCoefficient(int n , int r) {
        int numerator = factorialOfNumber(n);
        int denominator = factorialOfNumber(r) * factorialOfNumber(n-r);    
        int result = numerator / denominator;
        return result;
    }



    
    // Function - reusesable code
    public static void main(String[] args) {
        // printHelloWorld();   // Callback to function printHelloWorld
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number : ");
        // int firstNumber = sc.nextInt();

        // System.out.print("Enter Second Number : ");
        // int secondNumber = sc.nextInt();

        // calculateSum(firstNumber, secondNumber);  // Arguments or actual parameters

        // swapTwonumbers(45 , 78);

        // System.out.println(multiplyTwoNumbers(10, 20));

        // System.out.println(factorialOfNumber(5));
        System.out.println(binomialCoefficient(5, 2));

    }
    
}
