package excercises.singleton;

public class MySingletonClass {

    private MySingletonClass mySingletonClassObj = null;

    public MySingletonClass getInstance() {
        System.out.println("I'm MySingletonClass constructor");

        if (mySingletonClassObj == null) {
            System.out.println("Initializing only one time");
            mySingletonClassObj = new MySingletonClass();
        }
        return mySingletonClassObj;
    }
}
