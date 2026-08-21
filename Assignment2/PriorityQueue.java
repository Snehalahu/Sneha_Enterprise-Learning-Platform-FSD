import java.util.PriorityQueue;

class Ticket implements Comparable<Ticket> {
    String issue;
    int priority;

    Ticket(String issue, int priority) {
        this.issue = issue;
        this.priority = priority;
    }

    
    @Override
    public int compareTo(Ticket other) {
        return other.priority - this.priority;
    }

    @Override
    public String toString() {
        return issue + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Ticket> tickets = new PriorityQueue<>();

       
        tickets.add(new Ticket("Server Down", 5));
        tickets.add(new Ticket("Login Problem", 2));
        tickets.add(new Ticket("Database Error", 4));
        tickets.add(new Ticket("UI Bug", 1));

        System.out.println("Tickets handled by priority:");

        while (!tickets.isEmpty()) {
            System.out.println(tickets.poll());
        }
    }
}
