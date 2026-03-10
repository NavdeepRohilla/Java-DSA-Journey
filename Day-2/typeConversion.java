public class typeConversion {
    public static void main(String[] args) {
        // int a = 45;
        // long b = a;
        // This is allowed because long is bigger in size than int

        // Now this is Not allowed because source type(int) is smaller than destination type(long).
        long a = 54;
        //int b = a; this is not allowed so do this
        int b = (int)a;

        char ch = 'a';
        int number = ch;

        char ch2 = 'b';
        int number2 = ch2;

        System.out.println(number);
        System.out.println(number2);
        System.out.println(b);

        byte num = 5;
        num = (byte)(num * 2);

        System.out.println(num);
    }
}
