public class Main {
    public static void main(String[] args) {

        int initial = 500; // начальный счет
        int replenishment = 1500; // сумма пополнения счета
        int bonus; // количество бонусных рублей

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int result = initial + replenishment + bonus;

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счет: " + result);

    }
}
