public class Mango extends Fruit {
    String taste;
    String color;

    {
        this.taste = "Sweet";
        this.color = "Yellow";
        super.price = 200;
    }

    public Mango() {

    }

    public Mango(int Qty) {
        super.Qty = Qty;
    }

    @Override
    public void displayFruit() {
        System.out.println("====MANGO DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        System.out.println("PRICE (1 APPLE) : " + super.price);
        System.out.println("Quantity : " + super.Qty);
    }
}
