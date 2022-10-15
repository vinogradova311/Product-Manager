import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlreadyExistsExceptionTest {

    Product item1 = new Product(198, "T-shirt", 300);
    Book item2 = new Book(567, "1984", 1000, "Orwell");
    Smartphone item3 = new Smartphone(908, "Iphone 8", 59999, "Apple");
    Book item4 = new Book(12, "Arch of Triumph", 489, "Remarque");
    Smartphone item5 = new Smartphone(4839, "Iphone 9", 101901, "Apple");
    @Test
    public void alreadyExistTest() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);

        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            repo.save(item5);
        });
    }
}
