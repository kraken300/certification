public class TwoWheeler {
    String brand;
    String model;
    int cc;
    int price;
    int noOFTyres;

    public void mileage(){
        System.out.println("Distance covered per kilometer");
    }

    public void displayDetails(){
        System.out.println("========2-Wheeler========");
        System.out.println("Brand : "+this.brand);
        System.out.println("Model : "+this.model);
        System.out.println("Capacity : "+this.cc);
        System.out.println("Price : "+this.price);
        System.out.println("No of Tyres : "+this.noOFTyres);
    }
}
