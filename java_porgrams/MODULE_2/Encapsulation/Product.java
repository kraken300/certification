public class Product {
    private String name;
    private int id;
    private double price;

    public Product() {

    }

    public Product(String name, int id, double price) {
        setName(name);
        setId(id);
        setPrice(price);
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
