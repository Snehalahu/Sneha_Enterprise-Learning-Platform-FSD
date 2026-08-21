class Notification {

    void send() {
        System.out.println("Sending notification...");
    }
}

class Email extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email notification.");
    }
}

class SMS extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS notification.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Notification n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();
    }
}
