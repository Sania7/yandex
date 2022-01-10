package enums.colorpdd;

public class Practicum {
    public static void main(String[] args) {
        TrafficLight t = null;
        tryToCrossStreet(TrafficLight.RED);
    }

    public static void tryToCrossStreet(TrafficLight light) {
        if (light.equals(TrafficLight.GREEN)) {
            System.out.println("Переходите дорогу!");
        } else {
            System.out.println("Ждите");
        }
    }
}

enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}
