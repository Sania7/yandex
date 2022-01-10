package oop.tezla;

public class Practicum {
    public static void main(String[] args) {
        ModelZ testCar = new ModelZ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)"); // ускорение 100 км в час
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч"); // макс скорость 300 км в час

        System.out.println("\nНачало теста!");

        System.out.println("Едем на автопилоте:"); // скорость на автопилоте через 5 секунд 55 км в час
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Z спустя 5с на автопилоте: " + testCar.speed + " км/ч"); // спустя еще 5 секунд на автопилоте 60 км в час
        checkResult(55.0, testCar.speed);

        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Z спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");
        checkResult(60.0, testCar.speed);


        System.out.println("Переходим в ручной режим:");// переходим в ручной режим...
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Z спустя 2с в ручном режиме: " + testCar.speed + " км/ч");// скорость в ручном режиме 260 км в час
        checkResult(260.0, testCar.speed);

        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Z спустя ещё 2с в ручном режиме: " + testCar.speed + " км/ч"); //скорость в ручном режиме 300 км в час
        checkResult(300.0, testCar.speed);
        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.print("Время торможения до полной остановки: " + brakingTime + "c");
        checkResult(3, brakingTime);
        System.out.print("Скорость Z: " + testCar.speed + " км/ч");
        checkResult(0.0, testCar.speed);
    }

    private static void checkResult(double expect, double actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }

    private static void checkResult(int expect, int actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }
}
