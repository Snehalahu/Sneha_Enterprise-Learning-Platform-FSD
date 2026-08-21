class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
