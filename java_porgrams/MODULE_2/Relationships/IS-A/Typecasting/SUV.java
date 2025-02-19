public class SUV extends Cab {
    int distance;

    public SUV() {
        this.price = 100;
    }

    public SUV(int distance) {
        this();
        this.distance = distance;
    }

    public void fare() {
        System.out.println("TOTAL FARE : Rs. " + this.price * this.distance);
    }
}
