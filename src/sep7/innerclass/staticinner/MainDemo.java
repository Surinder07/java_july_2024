package sep7.innerclass.staticinner;


class Furniture {
    private String color;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static class Chair {
        public void hasSeatingCapacity(){
            System.out.println("You can sit inside the chair");
        }
    }
}

public class MainDemo {
    public static void main(String[] args) {
        Furniture.Chair obj1 = new Furniture.Chair();
        obj1.hasSeatingCapacity();
    }
}
