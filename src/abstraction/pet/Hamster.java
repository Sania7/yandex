package abstraction.pet;

public class Hamster extends Pet {


    public Hamster() {
        super(4);
    }

    public void hideFood() {
        System.out.println("Вся еда - в щечках!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Хрум-хрум)");;
    }

}
