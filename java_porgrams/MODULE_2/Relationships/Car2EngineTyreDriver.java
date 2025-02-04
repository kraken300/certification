public class Car2EngineTyreDriver {
    public static void main(String[] args) {
        Car2 c1 = new Car2("TATA", 100000, "NANO");

        c1.createEngine(140, "PETROL", 200);

        c1.createTyre("MRF", 10000);
        c1.createTyre("APPOLLO", 20000);
        c1.createTyre("CEAT", 16000);
        c1.createTyre("BRIDGESTONE", 20000);

        c1.displayCarInfo();
    }
}