import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product product = new Product(12, "Мгла", 400);

    @Test
    public void shouldGetId(){
        int expected = 12;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetName(){
        String expected = "Мгла";
        String actual = product.getName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetPrice(){
        int expected = 400;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetId(){
        product.setId(14);
        int expected = 14;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetName(){
        product.setName("Туман");
        String expected = "Туман";
        String actual = product.getName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrice(){
        product.setPrice(350);
        int expected = 350;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }
}
