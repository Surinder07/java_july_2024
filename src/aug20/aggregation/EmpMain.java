package aug20.aggregation;

public class EmpMain {
    public static void main(String[] args) {
       // Address add1 = new Address("110 Matheson blvd","Mississauga","CA", "L1K2S3");
        Employee emp1 = new Employee(101, "Amit", "A", "amit@gmail.com",new Address("110 Matheson blvd","Mississauga","CA", "L1K2S3"));
        System.out.println(emp1.address.country);

        // Address -- streetname, city, country , postal code
        // Name --- first name , middle name, last Name
    }
}
