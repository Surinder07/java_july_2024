package sep7.exception;

public class Test {
    public static void main(String[] args) {

        show();

    }

    public static void show(){
        test();
    }

    public static void test(){
        show();
    }
}
