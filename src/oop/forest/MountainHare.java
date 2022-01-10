package oop.forest;

public class MountainHare {

    // добавьте переменные и конструктор
    int age;
    double weight;
    double jumpLength;
    static String color;

    public MountainHare(int age, double weight, double jumpLength, String color) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
        this.color = color;
    }

    public MountainHare(int age, double weight, double jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
