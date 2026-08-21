class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println("Developer is writing Java code.");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Developer dev = new Developer();

        dev.work();

        dev.writeCode();
    }
}
