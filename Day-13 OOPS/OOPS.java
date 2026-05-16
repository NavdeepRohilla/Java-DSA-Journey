public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor(("Blue"));
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("Yellow")

        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "navdeepRohilla";
        myAcc.setPassword("asdfghjkl");


        Student st = new Student();
        st.name = "Navdeep";
        st.age = 21;
        st.calcPercentage(85, 90, 88);
        System.out.println(st.percentage);

        st.displayInfo();
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

    public String getPassword() {
        return password;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3.0f;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}