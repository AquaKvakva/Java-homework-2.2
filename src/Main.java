public class Main {
    public static void main(String[] args) {

        int balance = 200;
        System.out.println("Баланс: " + balance);

        int money = 900;
        System.out.println("Сумма пополнения: " + money);

        boolean isBonus = (money >= 1000);
        int percent;
        if (isBonus) {
            percent = money * 1 / 100;
        } else {
            percent = 0;
        }
        int x = money + percent;
        System.out.println("Сумма пополнения c бонусами: " + x);
        int total = balance + x;
        System.out.println("Баланс после пополнения: " + total );

    }
}