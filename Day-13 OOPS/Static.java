/*
Static Keyword in java is used to share the same variable or method of a given class.

- Properties
- Functions
- Blocks
- Nested Classes

*/



public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC School";

        Student s2 = new Student();
        System.out.println(s2.schoolName); // ABC School

        Student s3 = new Student();
        s3.schoolName = "XYZ School";
        System.out.println(s3.schoolName); // XYZ School
    }
}

class Student {
    static int returnPercentage(int phy, int chem, int math) {
        return (phy + chem + math) / 3;
    }
    String name;
    int age;
    static String schoolName; // static variable

    void setName(String name) {
        this.name = name;   
    }

    String getName() {
        return this.name;
    }
}
    