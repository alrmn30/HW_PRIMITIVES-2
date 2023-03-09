public class Main {
    public static void main(String[] args) {
        int balance = 10;
        int refill = 1100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + refill + bonus;
        System.out.println("Получено бонусных рублей: " + bonus);
        System.out.println("Ваш баланс: " + newBalance + " рублей(ля)");
    }
}
