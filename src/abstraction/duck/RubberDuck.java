package abstraction.duck;

public class RubberDuck extends Duck {

    public String getName() {
        return "Я - резиновая уточка!";
    }

    public void swim() {
        System.out.println("Да, я умею плавать!");
    }

    public void quack() {
        System.out.println("Кря!");
    }
}
