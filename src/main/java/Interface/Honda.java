package Interface;

public class Honda implements Bike{
    @Override
    public void run() {
        System.out.println("Bikes are running in speed");
    }

    public static void main(String[] args) {
        Honda rv = new Honda();
        rv.run();
    }
}
