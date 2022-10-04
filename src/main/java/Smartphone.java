public class Smartphone extends Product {

    private String fabricator;
    private String name;

    public Smartphone(int id, String name, int price, String fabricator) {
        super(id, name, price);
        this.fabricator = fabricator;
        this.name = name;
    }

}
