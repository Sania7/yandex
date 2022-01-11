package abstraction.pet;

public class Dog extends Pet {


    public Dog() {
        super(4);
    }

    public void bringStick() {
        System.out.println("Принес палочку, как хороший мальчик!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Гав-гав!");;
    }
}
