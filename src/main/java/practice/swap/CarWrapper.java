package practice.swap;

public class CarWrapper {
    Car c;

    CarWrapper(Car c) {
        System.out.println("c hascode " + c.hashCode());
        this.c = c;
    }

    void displayHashcode() {

    }
}
