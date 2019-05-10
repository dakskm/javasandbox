package geeksforgeeks.eg1;

public class Test {
    Day day;

    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public void dayIsLike() {
        switch (day) {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("MONDAY");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }

    public Test(Day day) {
        this.day = day;
    }

    public static void main(String args[]) {
        String str = "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIsLike();
    }
}
