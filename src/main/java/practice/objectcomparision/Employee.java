package practice.objectcomparision;

public class Employee {
    int eNo;
    String name;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            System.out.println("not an employee object");
            return false;
        } else {
            Employee eObj = (Employee) obj;
            if (this.eNo == eObj.eNo && this.name.equals(eObj.name)) {
                System.out.println("objects and values are equal");
                return true;
            } else {
                System.out.println("objects are equal but comparision failed");
                return false;
            }
        }
    }
}
