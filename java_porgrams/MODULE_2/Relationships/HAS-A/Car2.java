public class Car2 {
    private String brand;
    private int price;
    private String model;
    private Engine engine; // HAS-A RELATIONSHIP ESTABLISHED (ONE-TO-ONE)
    private Tyre[] tyres = new Tyre[4]; // HAS-A RELATIONSHIP ESTABLISHED (ONE-TO-MANY)

    private int count = 0;

    // CONSTRUCTORS
    public Car2() {

    }

    public Car2(String brand, int price, String model) {
        setBrand(brand);
        setPrice(price);
        setModel(model);
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

    public Tyre[] getTyres() {
        return this.tyres;
    }

    public Tyre getTyres(int index) {
        return this.tyres[index];
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

    public void setTyres(Tyre[] tyres) {
        this.tyres = tyres;
    }

    public void setTyres(String brand, int price, int index) {
        this.tyres[index] = new Tyre(brand, price);
    }

    // HELPER METHOD - is to create object of dependent class
    public void createEngine(int cc, String fueltype, int hp) {
        this.engine = new Engine(cc, fueltype, hp);
    }

    // HELPER METHOD FOR TYRES
    public void createTyre(String brand, int price) {
        if (count < tyres.length) {
            this.tyres[count++] = new Tyre(brand, price);
        } 
        else {
            System.out.println("Car already has all the tyres");
        }
    }

    // DISPLAY METHOD
    public void displayCarInfo() {
        System.out.println("======CAR INFO======");
        System.out.println("BRAND : " + this.brand);
        System.out.println("PRICE : $" + this.price);
        System.out.println("MODEL : " + this.model);

        if (this.engine != null) {
            this.engine.displayEngineInfo();
        }

        for (int i = 0; i < tyres.length; i++) {
            if (this.tyres[i] != null) {
                this.tyres[i].displayTyreInfo();
            }
        }
    }
}
