import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product item1 = new Product(198, "T-shirt", 300);
    Book item2 = new Book(567, "1984", 1000, "Orwell");
    Smartphone item3 = new Smartphone(9085, "Iphone", 99999, "Apple");

    @Test
    public void saveTest(){
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void removeByIdTest() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        Product[] expected = {item1, item3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

}
