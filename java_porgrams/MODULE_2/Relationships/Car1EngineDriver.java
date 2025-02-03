public class Car1EngineDriver {
    public static void main(String[] args) {
        Car1 c1 = new Car1("TATA", 100000, "NANO");
        System.out.println(c1.getEngine()); // NULL
        c1.displayCarInfo(); // NullPointerException

        // create engine object
        c1.createEngine(400, "PETROL", 240);
        System.out.println(c1.getEngine());
        c1.displayCarInfo();
    }
}
