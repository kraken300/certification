public class Product {
    private int id;
    private String name;
    private String brand;
    private int price;

    public Product(){

    }

    public Product(int id, String name, String brand, int price ){
        setID(id);
        setName(name);
        setBrand(brand);
        setPrice(price);
    }

    // GETTERS
    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    // SETTERS
    public void setID(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    // DISPLAY METHOD
    public void displayProductInfo() {
        System.out.println("======PRODUCT INFO======");
        System.out.println("ID : " + this.getID());
        System.out.println("NAME : " + this.getName());
        System.out.println("BRAND : " + this.getBrand());
        System.out.println("PRICE : $" + this.getPrice());
    }
}
