public class Main {
    public static void main(String[] args) {

        int balance = 200;
        System.out.println("Баланс: " + balance);

        int money = 1000;
        System.out.println("Сумма пополнения: " + money);

        boolean isBonus = (money > 1000);
        int percent;
        if (isBonus) {
            percent = money * 1 / 100;
        } else {
            percent = 0;
        }
        int bonusMoney = money + percent;
        System.out.println("Сумма пополнения c бонусами: " + bonusMoney);
        int total = balance + bonusMoney;
        System.out.println("Баланс после пополнения: " + total);

    }
}