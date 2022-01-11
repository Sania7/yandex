package abstraction.pet;

public class Spider extends Pet {


    public Spider() {
            super(8);
        }

        @Override
        public void giveVoice() {
            System.out.println("Хррхрр");;
    }

}
