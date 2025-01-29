public class CustomerDriver {
    public static void main(String[] args) {
        Customer c1 = Customer.createCustomer(1, "JOHN");

        c1.displayCustomer(); // METHOD 1
        Customer.displayCustomerDetails(c1); // METHOD 2
    }
}
