public class Car {
    private String brand;
    private int price;
    private String model;
    private Engine engine; // HAS- A RELATIONSHIP ESTABLISHED

    // CONSTRUCTORS
    public Car() {

    }

    public Car(String brand, int price, String model, int cc, String fueltype, int hp) {
        setBrand(brand);
        setPrice(price);
        setModel(model);
        this.engine = new Engine(cc, fueltype, hp);
    }

    // GETTERS
    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    // SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // DISPLAY METHOD
    public void displayCarInfo() {
        System.out.println("======CAR INFO======");
        System.out.println("BRAND : " + this.brand);
        System.out.println("PRICE : $" + this.price);
        System.out.println("MODEL : " + this.model);
        this.engine.displayEngineInfo();
    }
}
