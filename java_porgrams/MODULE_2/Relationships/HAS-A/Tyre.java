public class Tyre {
    private String brand;
    private int price;

    public Tyre() {

    }

    public Tyre(String brand, int price) {
        setBrand(brand);
        setPrice(price);
    }

    // GETTERS
    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    // SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // DISPLAY METHOD
    public void displayTyreInfo() {
        System.out.println("======TYRE INFO======");
        System.out.println("BRAND : " + this.brand);
        System.out.println("PRICE : " + this.price);
    }
}
