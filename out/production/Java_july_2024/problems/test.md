## Problem: Employee Management System
You are tasked with creating a simple Employee Management System. 
You need to design a system using Java that demonstrates inheritance, polymorphism, 
encapsulation, constructors, and methods.

Requirements
Create a base class called Employee:

## Private Fields:
id (int)
name (String)
salary (double)
Constructors:

## A parameterized constructor to initialize all fields.
Methods:
getId(): Returns the ID of the employee.
getName(): Returns the name of the employee.
getSalary(): Returns the salary of the employee.
setSalary(double salary): Sets the salary of the employee.
calculateBonus():  method to calculate a bonus for the employee.

Create a subclass called FullTimeEmployee that extends Employee:

## Additional Fields:
annualLeaveDays (int)
Constructors:
A parameterized constructor that initializes all fields including those of the superclass.
Methods:
getAnnualLeaveDays(): Returns the number of annual leave days.
setAnnualLeaveDays(int leaveDays): Sets the number of annual leave days.
Override calculateBonus(): Implement this method to calculate a bonus as 10% of the salary.
Create another subclass called PartTimeEmployee that extends Employee:

## Additional Fields:
hoursWorked (int)
Constructors:
A parameterized constructor that initializes all fields including those of the superclass.
Methods:
getHoursWorked(): Returns the number of hours worked.
setHoursWorked(int hours): Sets the number of hours worked.
Override calculateBonus(): Implement this method to calculate a bonus as 5% of the salary per hour worked.
Demonstrate Polymorphism:

## Create an array of Employee objects that contains both FullTimeEmployee and PartTimeEmployee instances.
## Iterate through the array and print out the details and bonus of each employee by calling the 
## calculateBonus() method.