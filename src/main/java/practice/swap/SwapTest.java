package practice.swap;

public class SwapTest {
    public static void main(String args[]) {
        Car c1 = new Car("WagonR", 2006);
        Car c2 = new Car("Nissan", 2010);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);

        swap(cw1, cw2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

    static void swap(CarWrapper cw1, CarWrapper cw2) {
        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }
}
