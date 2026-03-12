/*
Assignment Operators:- Assignment Operators are the operators which assigns value . 
- '='  a = b
- '+=' -- a = a + 1
- '-=' -- a = a - 1
- '*=' -- a = a * 1
- '/=' -- a = a / 1
*/
public class assignmentOperators {
    public static void main(String[] args) {
        int a = 5 ;
        int b = a;

        System.out.println(b);
        
        a += 1;
        System.out.println(a);

        a -= 2;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a/= 3;
        System.out.println(a);

    }
}
