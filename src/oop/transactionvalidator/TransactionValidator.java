package oop.transactionvalidator;

public class TransactionValidator {

    public static final double MIN_AMOUNT = 1; // объявите константы

    public static final double MAX_AMOUNT = 5000; // объявите константы


    static boolean isValidAmount(double amount) { // объявите метод isValidAmount()
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}
