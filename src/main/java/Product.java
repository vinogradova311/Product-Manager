public class Product {

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    protected int id;
    protected String name;
    protected int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
