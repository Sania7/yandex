package abstraction.pet;

public abstract class Pet {

    private int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void sleep(){
        System.out.println("Сплю.");
    }
    public void play(){
        System.out.println("Играю.");
    }

    public abstract void giveVoice();
}
