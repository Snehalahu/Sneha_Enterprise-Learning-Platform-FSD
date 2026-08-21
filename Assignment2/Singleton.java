class Singleton {

 
    private static Singleton obj;

  
    private Singleton() {
        System.out.println("Object Created");
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Both are the same object");
        }
    }
}
