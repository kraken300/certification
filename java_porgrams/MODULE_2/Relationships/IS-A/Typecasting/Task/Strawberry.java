public class Strawberry extends Fruit {
    String taste;
    String color;

    {
        this.taste = "Sweet and Sour";
        this.color = "Pinkish Red";
        super.price = 300;
    }

    public Strawberry() {

    }

    public Strawberry(int Qty) {
        super.Qty = Qty;
    }

    @Override
    public void displayFruit() {
        System.out.println("====STRAWBERRY DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        System.out.println("PRICE (1 APPLE) : " + super.price);
        System.out.println("Quantity : " + super.Qty);
    }
}
