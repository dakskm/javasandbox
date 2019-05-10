package practice.swap;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Car implements Cloneable {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        String output = String.format("Car model is %s and year is %d", model, year);
        return output;
    }
}
