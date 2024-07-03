
public class Main {
    public static void main(String[] args) {
        FilmsManager filmsManager = new FilmsManager(6);

        filmsManager.addFilm("Легенда");
        filmsManager.addFilm("Форсаж");
        filmsManager.addFilm("Форсаж2");
        filmsManager.addFilm("Форсаж3");
        filmsManager.addFilm("Форсаж4");
        filmsManager.addFilm("Форсаж5");
        filmsManager.addFilm("Форсаж6");


        filmsManager.lastFilm();

    }
}
