package java8.consumer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConsumerExample {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();

        lst.add("ram");
        lst.add("sowju");
        lst.add("rudra");
        lst.add("dakshin");

//        lst.forEach(p -> System.out.println(p));

        List<Person> plst = new ArrayList<Person>();

        plst.add(new Person(1, "sowju"));
        plst.add(new Person(4, "p2"));
        plst.add(new Person(6, "p3"));
        plst.add(new Person(2, "rudra"));
        plst.add(new Person(3, "ram"));
        plst.add(new Person(5, "p1"));

        plst.forEach(p -> System.out.println("id " + p.id + " name " + p.name));

        Iterator<Person> plistIterator = plst.iterator();

        while (plistIterator.hasNext() == true) {
            Person p = plistIterator.next();
            if (p.name.equals("p2")) {
                plistIterator.remove();
            }
        }

        Iterator<Person> plistIterator1 = plst.iterator();

        while (plistIterator1.hasNext() == true) {
            Person p = plistIterator1.next();
            System.out.println("id " + p.id + " name " + p.name);
        }

        System.out.println("done");

        plst.removeIf(p -> p.name == "p3");

        plst.forEach(p -> System.out.println("id " + p.id + " name " + p.name));

        plst.forEach(p -> p.setName(p.getName() + " - Dakshin"));

        plst.forEach(p -> System.out.println("id " + p.id + " name " + p.name));

        plst.replaceAll(p -> new Person(p.id, p.getName() + " - happy"));

        plst.forEach(p -> System.out.println(p.name));

        System.out.println("after sorting:");

        plst.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));

        plst.forEach(p -> System.out.println(p.name));
    }
}
