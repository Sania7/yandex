package oop;

public class Coffee {
    protected double espresso; //переменная
    protected double milk; // переменная

    public Coffee() { // конструктор
        espresso = 50.0;// эспрессо 50 мл
        milk = 250.0; // молоко 250 мл
    }

    public double mixAndGetVolume() { //геттер
        return espresso + milk;
    }
}

class Cappuccino extends Coffee { // наследование
    private double milkFoam;
    public double getMilkFoam() {
        milkFoam = milk / 2;
        return milkFoam;
    }
}

class Latte extends Coffee { //наследование
}

 class Practicum { //класс с майн методом
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        // напрямую используем метод суперкласса:
        System.out.println("Объём чашки капучино - " + cappuccino.mixAndGetVolume());//вызвали метод где смешали ингридиенты
        System.out.println("Объем молочной пены - " + cappuccino.getMilkFoam());
        Latte latte = new Latte();
        // напрямую используем переменную суперкласса:
        System.out.println("Объём эспрессо в латте - " + latte.espresso); //создали объект латте плюс объем эспрессо
    }
}
