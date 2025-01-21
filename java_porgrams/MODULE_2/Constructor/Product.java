public class Product {
    int pid;
    double price;
    String name;
    String brand;

    public Product(){

    }

    public Product(int pid){
        this.pid = pid;
    }

    public Product(double price){
        this.price = price;
    }

    public Product(String name){
        this.name = name;
    }

    // Same Signature
    // public Product(String brand){
    //     this.brand = brand;
    // }

    public Product(int pid, double price){
        // this.pid = pid;
        this(pid);
        this.price = price;
    }

    public Product(int pid, double price, String name){
        // this.pid = pid;
        // this.price = price;
        this(pid, price);
        this.name = name;
    }

    public Product(int pid, double price, String name, String brand){
        // this.pid = pid;
        // this.price = price;
        // this.name = name;
        this(pid, price, name);
        this.brand = brand;
    }

    public void displayData(){
        System.out.println("====Product Details====");
        System.out.println("ID : "+this.pid);
        System.out.println("Price : "+this.price);
        System.out.println("Name : "+this.name);
        System.out.println("Brand : "+this.brand);
    }
}
