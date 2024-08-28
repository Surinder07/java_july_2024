package aug27;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student(101, "Ayushi",100000.00);
        System.out.println(student);

        // not able to set values
        /*student.name = "Vidhi";
        student.salary = 200000.00;*/

        System.out.println("Student after modification ... ");

        System.out.println(student.getRollNo());
        System.out.println(student.getName());
        System.out.println(student.getSalary());

        student.setName("Vidhi");
        System.out.println("New Name after update : "+student.getName());
        student.setSalary(1000);
        System.out.println(student);

    }
}
