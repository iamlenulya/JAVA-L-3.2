public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long refill = 1100;
        long bonus = 0;
        if (refill > 100) {
            bonus = refill / 100;
            balance = balance + refill + bonus;
        }
        else {
            balance = balance + refill;
        }
        System.out.println(bonus);
        System.out.println(balance);
    }
}
