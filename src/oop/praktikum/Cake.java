package oop.praktikum;

public class Cake {

    final static int PHONE_LENGTH = 11;
    final static int MIN_PASSWORD_LENGTH = 8;
    public static void validateCredentials(String phone, String password) {
        if (phone.length() != PHONE_LENGTH) {
        System.out.println("Введите номер в формате 7xxxxxxxxxxx, где x - любая цифра.");
    }
        if (password.length() < MIN_PASSWORD_LENGTH) {
        System.out.println("Минимальная длина пароля: 8 знаков.");
    }
}

    public static void main(String[] args) {
        validateCredentials("7901000000", "Qwerty");
    }
}
