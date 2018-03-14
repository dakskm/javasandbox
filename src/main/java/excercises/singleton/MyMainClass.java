package excercises.singleton;

public class MyMainClass {
    public static void main(String args[]) {
        MySingletonClass mySingletonClass = new MySingletonClass().getInstance();

        MySingletonClass mySingletonClass1 = new MySingletonClass().getInstance();
    }
}
