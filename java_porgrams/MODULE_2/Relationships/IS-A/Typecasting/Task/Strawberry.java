public class Strawberry extends Fruit {
    String taste;
    String color;

    public Strawberry() {

    }

    public Strawberry(int Qty) {
        super(30, Qty);
        this.taste = "Sweet and Sour";
        this.color = "Pinkish Red";
    }

    @Override
    public void displayFruit() {
        System.out.println("====STRAWBERRY DETAILS====");
        System.out.println("TASTE : " + this.taste);
        System.out.println("COLOR : " + this.color);
        super.displayFruit();
    }
}
