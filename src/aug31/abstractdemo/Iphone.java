package aug31.abstractdemo;

public class Iphone extends Mobile{
    @Override
    public void call() {
        System.out.println("Calling using Hey Siri in iphone... ");
    }

    @Override
    public void wireless() {
        System.out.println("Make calls wirlesslessy ");
    }

    @Override
    public void messages() {
        System.out.println("You can send me i message...");
    }


    public void makeVideoCalls(){
        System.out.println();
    }
}
