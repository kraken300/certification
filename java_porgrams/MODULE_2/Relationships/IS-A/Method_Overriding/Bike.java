public class Bike extends TwoWheeler {

    public Bike(String brand, String model, int cc, int price, int noOFTyres){
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.price = price;
        this.noOFTyres = noOFTyres;
    }

    @Override
    public void mileage(){
        System.out.println("Mileage : 50 kilometers per litre (Average)");
    }
}
