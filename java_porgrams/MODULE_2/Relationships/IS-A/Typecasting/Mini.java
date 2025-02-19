public class Mini extends Cab {
    int distance;

    public Mini() {
        super(10);
    }

    public Mini(int distance) {
        this();
        this.distance = distance;
    }

    public void fare() {
        System.out.println("TOTAL FARE : Rs. " + this.price * this.distance);
    }
}
