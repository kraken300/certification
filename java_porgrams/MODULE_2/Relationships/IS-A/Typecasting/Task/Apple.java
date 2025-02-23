public class Apple extends Fruit {
    String taste;
    String color;

    public Apple() {

    }

    public Apple(int Qty) {
        super(10, Qty);
        this.taste = "Sweet";
        this.color = "Red";
    }

    @Override
    public void displayFruit() {
        System.out.println("====APPLE DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        super.displayFruit();
    }
}
