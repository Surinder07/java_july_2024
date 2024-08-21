package aug20.aggregation;

public class Employee {
    int id;
    String firstName;
    String lastName;
    String email;
    Address address;

    public Employee(int id, String firstName, String lastName, String email, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
}
