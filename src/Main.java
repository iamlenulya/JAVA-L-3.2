public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long refill = 1600;
        long amount;
        long bonus = refill / 100;
        if (refill <= 100) {
            bonus = 0;
            amount = balance + refill;
        }
        if (refill > 100) {
            bonus = refill / 100;
            balance = refill + bonus;
        }
        System.out.println(bonus);
    }
}
