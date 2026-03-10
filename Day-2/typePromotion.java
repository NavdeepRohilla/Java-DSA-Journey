/*
Type Promotion in Expression:-
1) Java automatically promotes each byte , short , char operand to int when evaluating an expression.
2) If one operand is long , float or double the whole expression is promoted to long , float or double respectively.

*/

public class typePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        int sum = a + b;
        System.out.println(sum);

        short number1 = 5;
        byte number2 = 25;
        char c = 'c';
        byte bt = (byte) (number2 + number1 + c);

        System.out.println(bt);


        int num1 = 10;
        float num2 = 20.25f;
        long num3 = 25;
        double d = 30;
        double ans = num1+ num2 + num3 + d;
        System.out.println(ans);

    }
}
