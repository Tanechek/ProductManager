import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    Product product1 = new Product(1, "Инкогнито", 200);
    Product product2 = new Product(212, "Smartphone X100", 30_000);
    Product product3 = new Product(31, "Мгла", 400);

    @Test
    public void shouldAddAndRemoveProducts() {
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(product2.getId());

        Product[] expected = {product1, product3};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }
}
