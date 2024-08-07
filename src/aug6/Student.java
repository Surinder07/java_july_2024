package aug6;

public class Student {

    int id;
    String name;

    public Student() {
        System.out.println("Inside the default constructor ....");
    }

    public Student(int id) {
        this(); // 1
        this.id = id;
        System.out.println("inside parameterized constructor with id ");
    }

    public Student(int id, String name) {
        this(101);
        System.out.println("inside param const with id and name");
        this.id = id;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Asma");
    }



}
