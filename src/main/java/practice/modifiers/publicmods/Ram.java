package practice.modifiers.publicmods;

public class Ram extends Dakshin {
    public void display() {
        System.out.println("I'm Ram, I can get direct access to Dakshin's phone without creating an object " + phone);
        System.out.println("I'm Ram, I can get direct access to Sowju's phone without creating an object " + sowjuPhone);
    }
}
