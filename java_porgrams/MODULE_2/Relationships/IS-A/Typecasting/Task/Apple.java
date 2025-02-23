public class Apple extends Fruit {
    String taste;
    String color;

    {
        this.taste = "Sweet";
        this.color = "Red";
        super.price = 100;
    }

    public Apple() {

    }

    public Apple(int Qty) {
        super.Qty = Qty;
    }

    @Override
    public void displayFruit() {
        System.out.println("====APPLE DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        System.out.println("PRICE (1 APPLE) : " + super.price);
        System.out.println("Quantity : " + super.Qty);
    }
}
