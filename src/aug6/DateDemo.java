package aug6;

public class DateDemo {

    int day;
    int month;
    int year;


    // default constructor
    DateDemo(){
        day = 6;
        month = 8;
        year = 2024;
    }

    // parameterized constructor

    DateDemo(int day, int month ){
        this(); // this() , to call a default constructor
        this.day = day;
        this.month = month;
    }

    public DateDemo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // this



    public void displayDate(){
        System.out.println(day + " / " + month + "/ " + year);

    }

}
/*

create a class Named Car

properties : Model , Color, Year, Type = Sedan, Hatchback

create a constructor
1. No args constructor [default]
2. 1 arg
3. 2 args constructor
4. 3 args constructor
5. all args constructor.


create diff objects for all constructors types and pass those values to print something...








 */
