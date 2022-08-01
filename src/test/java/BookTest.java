import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book(123,"Огонь", 400, "Шорохов");

    @Test
    public void shouldGetAuthor(){
        String expected = "Шорохов";
        String actual = book.getAuthor();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAuthor(){
        book.setAuthor("Волков");
        String expected = "Волков";
        String actual = book.getName();
    }
}
