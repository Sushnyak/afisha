import java.sql.SQLOutput;

public class FilmsManager {

    private int outputQuantity = 0;

    public FilmsManager(int outputQuantity) {
        this.outputQuantity = outputQuantity;
    }

    public FilmsManager() {
        this.outputQuantity = 5;
    }

    String[] films = {};

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i]);
        }
        return films;
    }

    public String[] lastFilm() {
        int number = films.length - 1;

        String[] lastFilms = new String[outputQuantity];

        //if (outputQuantity >= films.length) {
        //    String[] lastFilms = new String[outputQuantity];
        //} else {
        //    String[] lastFilms = new String[films.length];
        //}

        for (int i = 0; i < outputQuantity; i++) {
            System.out.println(films[number]);
            lastFilms[i] = films[number];
            number = number - 1;
        }
        return lastFilms;
    }
}