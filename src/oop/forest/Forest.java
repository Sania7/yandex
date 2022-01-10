package oop.forest;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }


    private static String season; // объявите недостающие переменные и добавьте конструктор


    public List<MountainHare> getHares() {
        return hares;
    }

    public static void setSeason(String newSeason) { // добавьте метод setSeason(String newSeason)
       season = newSeason;
       if (season.equals("зима")) {
           MountainHare.color = "белый";
       } else {
           MountainHare.color = "серо-рыжий";
       }
    }
    // в этом методе реалищуйте логику смены цвета шубок зайцев-беляков

    public void printHares() { // добавьте метод printHares()
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
