package sep7.innerclass.annoy;

 abstract class Laptop {

    abstract void calculate();
    abstract void surfInternet();

}

/*class DellLaptop extends Laptop {

    @Override
    void calculate() {
        System.out.println("Dell laptop is calcuating some data ");
    }

    @Override
    void surfInternet() {
        System.out.println("You can surf internet on dell laptop ");
    }
}*/

public class MainDemo {

    public static void main(String[] args) {

        Laptop dellLaptop = new Laptop() {
            @Override
            void calculate() {
                System.out.println("Dell laptop is calcuating some data ");
            }

            @Override
            void surfInternet() {
                System.out.println("You can surf internet on dell laptop ");
            }
        };

        dellLaptop.calculate();
        dellLaptop.surfInternet();





        /*DellLaptop dellLaptop = new DellLaptop();
        dellLaptop.calculate();
        dellLaptop.surfInternet();*/
    }
}
 // 10- 15 mins ,