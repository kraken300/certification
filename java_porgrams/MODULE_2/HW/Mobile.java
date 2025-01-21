public class Mobile{
    int id, ram, rom, camera, charging_speed;
    String type, brand, model, processor, display, sim_card;
    double price;

    public Mobile(){

    }

    public Mobile(int id, String type, double price){
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Mobile(int id, String type, String brand, String model, double price){
        this(id, type, price);
        this.brand = brand;
        this.model = model;
    }

    public Mobile(int id, String type, String brand, String model, int ram, int rom, int camera, String sim_card, double price){
        this(id, type, brand, model, price);
        this.ram = ram;
        this.rom = rom;
        this.camera = camera;
        this.sim_card =sim_card;
    }

    public Mobile(int id, String type, String brand, String model, int ram, int rom, int camera, int charging_speed, String processor, String display, String sim_card, double price){
        this(id, type, brand, model, ram, rom, camera, sim_card, price);
        this.charging_speed = charging_speed;
        this.processor = processor;
        this.display = display;
    }

    public void displayDetails(){
        System.out.println("====Mobile Details====");

        System.out.println("ID : " + this.id);
        System.out.println("Type : " + this.type);
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("RAM : " + this.ram);
        System.out.println("ROM : " + this.rom);
        System.out.println("Camera : " + this.camera);
        System.out.println("Charging Speed : " + this.charging_speed);
        System.out.println("Processor : " + this.processor);
        System.out.println("Display : " + this.display);
        System.out.println("Sim Card Support : " + this.sim_card);
        System.out.println("Price : $" + this.price);
    }
}