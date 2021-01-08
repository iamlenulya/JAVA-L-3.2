public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long refill = 1100;
        long bonus = refill / 100;
        if (refill <= 100) {
            bonus = 0;
        }
        else {
            balance = balance + refill;
        }
        if (refill > 100) {
            bonus = refill / 100;
        }
        else {
            balance = balance + refill + bonus;
    }
        System.out.println(bonus);
        System.out.println(balance);
        }
}
