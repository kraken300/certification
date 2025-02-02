public class Engine {
    private int cc;
    private String fueltype;
    private int hp;

    public Engine() {

    }

    public Engine(int cc, String fueltype, int hp) {
        setCC(cc);
        setFueltype(fueltype);
        setHP(hp);
    }

    // GETTERS
    public int getCC() {
        return this.cc;
    }

    public String getFueltype() {
        return this.fueltype;
    }

    public int getHP() {
        return this.hp;
    }

    // SETTERS
    public void setCC(int cc) {
        this.cc = cc;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    // DISPLAY METHOD
    public void displayEngineInfo() {
        System.out.println("======ENGINE INFO======");
        System.out.println("FUEL TYPE : " + this.fueltype);
        System.out.println("CAPACITY : " + this.cc);
        System.out.println("HORSE POWER : " + this.hp);
    }
}