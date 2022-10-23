import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int initialAmount = 123; // начальная сумма на счету клиента
        int replenishmentAmount = 1_024; // сумма пополнения
        int bonusPerAmount = 100; // количество рублей для одного бонуса

        int bonus;
        if (replenishmentAmount > 1_000) {
            bonus = replenishmentAmount / bonusPerAmount;
        } else {
            bonus = 0;
        }
        System.out.println("Сумма бонуса: " + bonus);

        int total = initialAmount + replenishmentAmount + bonus; // итоговая сумма
        System.out.println("Итоговая сумма на счете: " + total);
    }
}
