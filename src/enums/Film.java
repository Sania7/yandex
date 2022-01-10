package enums;

public class Film {
    private String title;
    private FilmGenre genre;

    public Film(String title, FilmGenre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public FilmGenre getGenre() {
        return genre;
    }

    enum FilmGenre {
        FAMILY,
        COMEDY,
        DOCUMENTARY,
        DRAMA,
        HORROR,
        FANTASY,
        THRILLER
    }
}
