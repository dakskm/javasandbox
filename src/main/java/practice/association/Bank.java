package practice.association;

public class Bank {
    private String name;

    Bank(String name) {
        this.name = name;
    }

    String getBankName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
