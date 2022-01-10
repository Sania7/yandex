package test;

import java.util.*;

public class Praktikum {

    static int preRevolutionaryRuble = 884;
    static int sovietRuble = 337;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в современных рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите год (1913 или 1984)");
        int year = scanner.nextInt();

            switch (year) {
                case 1913:
                    amount /= 884; // Посчитайте, сколько у вас рублей для введённого года.
                    break;
                case 1984:
                    amount /= 337; // Реализуйте конвертацию для каждого случая.
                    break;
                default:
            }
            if ((year != 1913) && (year != 1984)) { // Если для указанного года нет курса, то выведите сообщение
                System.out.println("Для этого года у нас нет данных."); // "Для этого года у нас нет данных." и прекратите выполнение метода.
            } else {
                printPrices(year, amount); // Иначе вызовите метод printPrices.
            }
        return;
    }

    public static void printPrices(int year, double amount) {
        System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                + String.format("%,.2f", amount) + " р. "
                + "На эти деньги вы могли бы купить следующие товары:");

        HashMap<String, Double> prices = getPrices(year);
        for (Map.Entry<String,Double> entry : prices.entrySet()) {
            if (entry.getValue() < amount) { // Найдите все значения, у которых цена меньше переданной суммы.
                System.out.println(entry.getKey() + " - " + (int)(amount / entry.getValue()) + " шт.");
            }
        }

        // Определите количество товара, которое можно приобрести на переданную сумму.
        // Напечатайте значение в формате «<название> — <количество> шт.».
    }

    public static HashMap<String, Double> getPrices(int year) {
        HashMap<String, Double> prices = new HashMap<>();

        switch (year) {// Добавьте товары в prices в зависимости от значения переменной year.
            case 1913:// Цены 1913 года:
                prices.put("Корова", 60.0);
                prices.put("Курица", 0.60);
                prices.put("Рубашка", 1.0);
                prices.put("Шапка гусарская", 12.0);
                prices.put("Гармонь", 7.50);
                prices.put("Рояль", 200.0);
                break;
            case 1984:// Цены 1984 года:
                prices.put("Банка сгущёнки", 0.55);
                prices.put("Автомобиль «Запорожец»", 5600.0);
                prices.put("Мороженое", 0.20);
                prices.put("Шапка-ушанка цигейковая", 14.0);
                prices.put("Шампанское «Советское»", 3.6);
                prices.put("Карта мира", 2.54);
                prices.put("Мотоцикл «Восход»", 450.0);
                prices.put("Портативный кассетный магнитофон «Весна-202-1»", 195.0);
                prices.put("Пальто осеннее", 100.0);
                break;
            default:
        }
        return prices;
    }
}