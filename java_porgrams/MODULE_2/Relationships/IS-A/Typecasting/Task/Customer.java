public class Customer {
    int id;
    long mobile;

    public Customer() {

    }

    public Customer(int id, long mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public void displayCustomer() {
        System.out.println("\n\n====CUSTOMER DETAILS====");
        System.out.println("ID : " + this.id);
        System.out.println("Mobile Number : " + this.mobile);
    }
}