public class Laptop {
    int pid;
    String model;
    String brand;
    double price;

    public Laptop(){

    }

    public Laptop(int pid){
        this.pid = pid;
    }

    public Laptop(String brand){
        this.brand = brand;
    }

    public Laptop(double price){
        this.price = price;
    }

    public Laptop(int pid, String brand){
        // this.pid = pid;
        this(pid);
        this.brand = brand;
    }

    public Laptop(int pid, double price){
        // this.pid = pid;
        this(pid);
        this.price = price;
    }

    public Laptop(int pid, String brand, double price){
        // this.pid = pid;
        // this.brand = brand;
        this(pid, brand);
        this.price = price;
    }

    public Laptop(int pid, String model, String brand, double price){
        this(pid, brand, price);
        // this.pid = pid;
        this.model = model;
        // this.brand = brand;
        // this.price = price;
    }

    public void displayLaptopDetails(){
        System.out.println("=====Laptop Details====");
        System.out.println("ID : " + this.pid);
        System.out.println("Model : " + this.model);
        System.out.println("Brand : " + this.brand);
        System.out.println("Price : $" + this.price);
    }

}
