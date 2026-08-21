public class Throw {

    static void withdraw(int balance, int amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        int balance = 5000;
        int amount = 7000;

        withdraw(balance, amount);
    }
}
