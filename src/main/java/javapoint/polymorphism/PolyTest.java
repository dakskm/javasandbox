/**
 * This example is to prove that methods only can be overridden but not data members
 * assign a child class object to parent reference
 * access data member of child and parent class from the parent class reference
 * access methods of child and parent class from the parent class reference
 */

package javapoint.polymorphism;

class Bank {
    int ifsc;
    String name;
    int branchCode;

    int commonVariable = 10;

    Bank() {

    }

    Bank(int ifsc, String name, int branchCode) {
        this.ifsc = ifsc;
        this.name = name;
        this.branchCode = branchCode;
    }

    void display() {
        System.out.println("I'm the bank class");
    }
}

class Icici extends Bank {
    int ifsc;
    String name;
    int branchCode;
    int totalAccounts;
    String branchName;

    int commonVariable = 20;

    Icici() {

    }

    Icici(int ifsc, String name, int branchCode, int totalAccounts, String branchName) {
        super(ifsc, name, branchCode);
        this.totalAccounts = totalAccounts;
        this.branchName = branchName;
    }

    void display() {
        System.out.println("I'm the Icici class");
    }
}

public class PolyTest {
    public static void main(String args[]) {
        Bank b1 = new Bank();
        Icici i1 = new Icici();

        Bank b1i1 = new Icici();

        System.out.println("Bank b1: " + b1.commonVariable);
        System.out.println("Icici i1: " + i1.commonVariable);
        System.out.println("Bank b1i1: " + b1i1.commonVariable);

        b1.display();
        i1.display();
        b1i1.display();
    }
}
