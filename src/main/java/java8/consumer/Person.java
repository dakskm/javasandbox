package java8.consumer;

public class Person {
    int id;
    String name;

    Person(int id,String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setName(String str) {
        this.name = str;
    }
}
