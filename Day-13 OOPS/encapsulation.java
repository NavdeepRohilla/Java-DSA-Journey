// Small encapsulation example: `Student` has private fields with getters/setters.
public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ananya");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // trying to set invalid age is ignored by setter
        s.setAge(-5);
        System.out.println("Age after invalid set: " + s.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
