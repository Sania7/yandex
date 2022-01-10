package enums.tea;

public class Practicum {
    public static void main(String[] args) {
        for (TeaType type: TeaType.values()){
            System.out.println(type);
        }
    }
}

enum TeaType {

    BLACK,
    GREEN,
    WHITE,
    OOLONG,
    HERBAL
}
