import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Product(198, "T-shirt", 300);
    Book item2 = new Book(567, "1984", 1000, "Orwell");
    Smartphone item3 = new Smartphone(9085, "Iphone 9", 69999, "Apple");
    Smartphone item4 = new Smartphone(297525, "Iphone 10", 100100, "Apple");


    @Test
    public void searchTest() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {item2};
        Product[] actual = manager.searchBy("1984");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchTest2() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {item3, item4};
        Product[] actual = manager.searchBy("Iphone");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchNothingTest() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Harry Potter");

        Assertions.assertArrayEquals(expected, actual);
    }
}

