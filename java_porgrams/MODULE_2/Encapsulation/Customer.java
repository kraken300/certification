public class Customer {
    private int id;
    private String name;

    private Customer(){

    }

    private Customer(int id, String name){
        setId(id);
        setName(name);
    }

    //GETTERS
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    //SETTERS
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    // FACTORY METHOD
    public static Customer createCustomer(int id, String name){
        Customer c = new Customer(id, name);
        return c;

        // return new Customer(id,name);
    }

    //DISPLAY METHOD - 1 (non-static) 
    public void displayCustomer(){
        System.out.println("************Customer Details******************");
        // System.out.println("ID : " + this.id);
        // System.out.println("NAME : " + this.name);
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
    }

    //DISPLAY METHOD - 2 (non-static) 
    public static void displayCustomerDetails(Customer c){
        System.out.println("************Customer Details******************");
        System.out.println("ID : " + c.getId());
        System.out.println("NAME : " + c.getName());
    }

}
