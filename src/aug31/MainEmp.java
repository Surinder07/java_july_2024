package aug31;

public class MainEmp {
    public static void main(String[] args) {
        Employee ft1 = new FullTimeEmployee(101, "Mark", 200);
        Employee ft2 = new FullTimeEmployee(101, "Mark", 200);
        Employee ft3 = new FullTimeEmployee(101, "Mark", 200);
        double salary = ft1.getSalary();
        
        // int arr[] = new int[];
        Employee[] employees = {ft1,ft2, ft3 };
      

        System.out.println("Salary of the employee : "+salary);

        double bonus = ft1.calculateBonus();
        System.out.println("Bonus for the FT employee " + bonus);

        PartTimeEmployee pt = new PartTimeEmployee(102, "Peter", 20);
        double ptBonus = pt.calculateBonus();
        System.out.println("Part time employee Bonus " + ptBonus);


    }
}
