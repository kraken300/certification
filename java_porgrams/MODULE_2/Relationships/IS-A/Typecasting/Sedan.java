public class Sedan extends Cab {
    int distance;

    {
        super.price = 50;
    }

    public Sedan() {

    }

    public Sedan(int distance) {
        this.distance = distance;
    }

    public void fare() {
        System.out.println("TOTAL FARE : Rs. " + this.price * this.distance);
    }
}
