package learning;

public class Praktikum {
    public static void main(String[] args) {
        Flat myFlat = new Flat();

        setFlatNumber(myFlat, 7);
        System.out.println(myFlat.flatNumber);
    }

    private static void setFlatNumber(Flat flatToSet, int flatNumberToSet) {
        flatToSet.flatNumber = flatNumberToSet;
    }
}

class Flat {
    Integer flatNumber;
}

