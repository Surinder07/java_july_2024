package aug27;

public class Student {

    private int rollNo;
    private String name;
    private double salary;


    public Student(int rollNo, String name, double salary) {
        this.rollNo = rollNo;
        this.name = name;
        this.salary = salary;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
