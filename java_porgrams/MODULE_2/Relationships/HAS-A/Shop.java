public class Shop {
    private String shop_name;
    private String address;
    private String owner;
    private int no_employees;
    private Product product;

    public Shop() {

    }

    public Shop(String shop_name, String address, String owner, int no_employees, int id, String name, String brand,
            int price) {
        setShopName(shop_name);
        setAddress(address);
        setOwner(owner);
        setNoEmployees(no_employees);
        this.product = new Product(id, name, brand, price);
    }

    // GETTERS
    public String getShopName() {
        return this.shop_name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getNoEmployees() {
        return this.no_employees;
    }

    public Product getProduct(){
        return this.product;
    }

    // SETTERS
    public void setShopName(String shop_name) {
        this.shop_name = shop_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNoEmployees(int no_employees) {
        this.no_employees = no_employees;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    // DISPLAY METHOD
    public void displayShopInfo() {
        System.out.println("======SHOP INFO======");
        System.out.println("SHOP NAME : " + this.getShopName());
        System.out.println("ADDRESS : " + this.getAddress());
        System.out.println("OWNER : " + this.getOwner());
        System.out.println("NUMBER OF EMPLOYEES : " + this.getNoEmployees());
        this.product.displayProductInfo();
    }
}
