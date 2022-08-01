import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product product1 = new Book(1, "Инкогнито", 200, "Щенов");
    Product product2 = new Smartphone(212, "Smartphone X100", 30_000, "Китай");
    Product product3 = new Book(31, "Мгла", 400, "Марков");
    Product product4 = new Book(32, "Мгла", 500, "Пупсиков");

    @BeforeEach
    public void setup(){
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
    }

    @Test
    public void shouldReverseAllProducts(){
        Product[] expected = {product4, product3, product2, product1};
        Product[] actual = manager.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindByText(){
        Product[] expected = { product3, product4};
        Product[] actual = manager.searchBy("Мгла");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindByWrongText(){
        Product[] expected = new Product[0];
        Product[] actual = manager.searchBy("Мгла123");
        Assertions.assertArrayEquals(expected, actual);
    }

}
