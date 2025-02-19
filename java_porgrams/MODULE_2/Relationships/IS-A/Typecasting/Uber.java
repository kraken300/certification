public class Uber {
    Cab cab;

    public Uber() {

    }

    public Uber(Cab cab) {
        this.cab = cab;
    }

    public static void displayDetails(Cab cab) {
        // Mini mini = (Mini) cab;
        // System.out.println("\t Price : " + mini.price + " per km.");
        // System.out.println("\t Distance : " + mini.distance + " km.");
        // mini.fare();

        if (cab instanceof Mini) {
            Mini mini = (Mini) cab;
            System.out.println("\t Price : " + mini.price + " per km.");
            System.out.println("\t Distance : " + mini.distance + " km.");
            mini.fare();
        }

        else if (cab instanceof Sedan) {
            Sedan sedan = (Sedan) cab;
            System.out.println("\t Price : " + sedan.price + " per km.");
            System.out.println("\t Distance : " + sedan.distance + " km.");
            sedan.fare();
        }

        else if (cab instanceof SUV) {
            SUV suv = (SUV) cab;
            System.out.println("\t Price : " + suv.price + " per km.");
            System.out.println("\t Distance : " + suv.distance + " km.");
            suv.fare();
        }

        // JDK - 17 onwards // Guarded Pattern // Automatic downcasting
        if (cab instanceof Mini mini) {
            System.out.println("\t Price : " + mini.price + " per km.");
            System.out.println("\t Distance : " + mini.distance + " km.");
            mini.fare();
        }

        else if (cab instanceof Sedan sedan) {
            System.out.println("\t Price : " + sedan.price + " per km.");
            System.out.println("\t Distance : " + sedan.distance + " km.");
            sedan.fare();
        }

        else if (cab instanceof SUV suv) {
            System.out.println("\t Price : " + suv.price + " per km.");
            System.out.println("\t Distance : " + suv.distance + " km.");
            suv.fare();
        }
    }
}
