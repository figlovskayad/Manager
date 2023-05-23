import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();

    @Test
    public void shouldFindAllMovies(){
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        String[] actual = manager.findAll();
        String[] expected = {"Бладшот","Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка","Тролли. Мировой тур","Номер один" };
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldFindThreeMovies() {

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findOneMovie() {

        manager.add("Movie I");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMovies(){
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        String[] actual = manager.findLast();
        String[] expected = {"Номер один","Тролли. Мировой тур","Человек-невидимка","Джентельмены","Отель Белград"};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastThreeMovies(){
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        String[] actual = manager.findLast();
        String[] expected = { "Отель Белград","Вперед","Бладшот" };
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void findLastFiveMovies() {

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");

        String[] actual = manager.findLast();
        String[] expected = {"Movie V","Movie IV","Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }



}
