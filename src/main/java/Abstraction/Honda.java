package Abstraction;

public class Honda extends Bike{
    @Override
    void run() {
        System.out.println("Bikes are running very fast");
    }

    public static void main(String[] args) {
        Honda rv= new Honda();
        rv.run();
    }
}
