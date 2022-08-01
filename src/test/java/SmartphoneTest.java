import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(458, "X5", 50_000, "Russia");

    @Test
    public void shouldGetManufacture(){
        String expected = "Russia";
        String actual = smartphone.getManufacturer();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetManufacturer(){
        smartphone.setManufacturer("China");
        String expected = "China";
        String actual = smartphone.getManufacturer();
        Assertions.assertEquals(expected, actual);
    }
}
