import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void testAddFilm() {
        FilmsManager filmsManager = new FilmsManager();

        filmsManager.addFilm("Форсаж");

        String[] expected = {"Форсаж"};
        String[] actual = filmsManager.films;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        FilmsManager filmsManager = new FilmsManager();

        filmsManager.addFilm("Легенда");
        filmsManager.addFilm("Крепкий орешек");
        filmsManager.addFilm("Волк с Уол-Стрит");

        String[] expected = {"Легенда", "Крепкий орешек", "Волк с Уол-Стрит"};
        String[] actual = filmsManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilms() {
        FilmsManager filmsManager = new FilmsManager();

        filmsManager.addFilm("Легенда");
        filmsManager.addFilm("Форсаж");
        filmsManager.addFilm("Форсаж2");
        filmsManager.addFilm("Форсаж3");
        filmsManager.addFilm("Форсаж4");
        filmsManager.addFilm("Форсаж5");


        String[] expected = {"Форсаж5", "Форсаж4", "Форсаж3", "Форсаж2", "Форсаж"};
        String[] actual = filmsManager.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2FindLastFilms() {
        FilmsManager filmsManager = new FilmsManager(6);

        filmsManager.addFilm("Легенда");
        filmsManager.addFilm("Форсаж");
        filmsManager.addFilm("Форсаж2");
        filmsManager.addFilm("Форсаж3");
        filmsManager.addFilm("Форсаж4");
        filmsManager.addFilm("Форсаж5");
        filmsManager.addFilm("Форсаж6");

        String[] expected = {"Форсаж6", "Форсаж5", "Форсаж4", "Форсаж3", "Форсаж2", "Форсаж"};
        String[] actual = filmsManager.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

}
