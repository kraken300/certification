public class Fruit {
    int price;
    int Qty;

    public Fruit() {

    }

    public Fruit(int price, int Qty) {
        this.price = price;
        this.Qty = Qty;
    }

    public void displayFruit() {
        System.out.println("PRICE : " + this.price);
        System.out.println("Quantity : " + this.Qty);
    }
}
