package enums;

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Зелёная миля", Film.FilmGenre.DRAMA));
        films.add(new Film("Побег из Шоушенка", Film.FilmGenre.DRAMA));
        films.add(new Film("Властелин колец: Братство Кольца", Film.FilmGenre.FANTASY));
        films.add(new Film("Король Лев", Film.FilmGenre.FAMILY));
        filterByGenre(films, Film.FilmGenre.DRAMA);
    }
    public static void filterByGenre(List<Film> films, Film.FilmGenre genre) {
        for (Film film : films) {
            if (film.getGenre() == genre) {
                System.out.println(film.getTitle());
            }
        }
    }
}
