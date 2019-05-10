package excercises.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
  public static void main(String args[]) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("dakshin");
    al1.add("sowju");
    al1.add("ram");
    al1.add("rudra");

    ArrayList<String> al2 = (ArrayList<String>) al1.clone();

    System.out.println(al1.contains("Dakshin"));
    System.out.println(al2);
    System.out.println(al2.addAll(2, al1));
    System.out.println(al2);
    System.out.println(al2.get(4));
    System.out.println(al2);
    System.out.println(al2.lastIndexOf("dakshin"));

    Iterator itr = al2.iterator();

    while (itr.hasNext())
      System.out.println((String) itr.next());

    for (String al : al2)
      System.out.println(al);

    System.out.println("---------------------");

    for (int i = 0; i < al1.size(); i++)
      System.out.println(al1.get(i));

    System.out.println(al1.size());
    System.out.println(al2.size());

    al2.trimToSize();

    al2.add("new");

    for (String al : al2)
      System.out.println(al);

    System.out.println("Replace functionfun: ".replace("fun", "easy"));
  }
}
