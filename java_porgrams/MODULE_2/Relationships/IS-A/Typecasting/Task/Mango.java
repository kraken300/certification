public class Mango extends Fruit {
    String taste;
    String color;

    public Mango() {

    }

    public Mango(int Qty) {
        super(20, Qty);
        this.taste = "Sweet";
        this.color = "Yellow";
    }

    @Override
    public void displayFruit() {
        System.out.println("====MANGO DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        super.displayFruit();
    }
}
