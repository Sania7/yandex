package enums.visa;

public class Practicum {
    public static void main(String[] args) {
        for (VisaType type : VisaType.values()) {
            System.out.println("Константа: " + type.name()
                    + ", имя для вывода: " + type.toString());
        }
    }
}
enum VisaType {
    CLASSIC,
    GOLD,
    PLATINUM,
    SIGNATURE,
    INFINITE;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}