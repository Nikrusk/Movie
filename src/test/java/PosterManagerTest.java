import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddMovie() {
        PosterManager posterManager = new PosterManager();

        String[] expected = {};
        String[] actual = posterManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll () {

        PosterManager posterManager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";

        posterManager.addMovie(movie1);
        posterManager.addMovie(movie2);
        posterManager.addMovie(movie3);

        String[] actual = posterManager.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLessLimit () {

        PosterManager posterManager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";

        posterManager.addMovie(movie1);
        posterManager.addMovie(movie2);
        posterManager.addMovie(movie3);

        String[] actual = posterManager.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreLimit () {

        PosterManager posterManager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        posterManager.addMovie(movie1);
        posterManager.addMovie(movie2);
        posterManager.addMovie(movie3);
        posterManager.addMovie(movie4);
        posterManager.addMovie(movie5);
        posterManager.addMovie(movie6);
        posterManager.addMovie(movie7);

        String[] actual = posterManager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }
}
