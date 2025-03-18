import java.util.ArrayList;

public class Amazon {
    // private Product[] products = new Product[4];
    private ArrayList<Product> products = new ArrayList<>();
    private Cart cart;

    // int count = 0;

    public Amazon() {

    }

    public Amazon(Product[] prod) {

    }

    public void addProduct(int id, String name, String brand, String price) {
        // if (count < products.length) {
        // products[count++] = Product.createProduct(id, name, brand, price);
        // }

        products.add(Product.createProduct(id, name, brand, price));
    }

    public void removeProduct(int id) {

        // Product[] updatedProducts = new Product[products.length - 1];

        // int k = 0;
        // for (int i = 0; i < products.length; i++) {

        // if (products[i].getID() == id) {
        // continue;
        // }

        // else {
        // updatedProducts[k++] = products[i];
        // }
        // }

        // products = updatedProducts;
        products.remove(id);
    }

    public void displayAllProducts() {
        // for (int i = 0; i < products.length; i++) {
        // if (products[i] != null) {
        // System.out.println(products[i]);
        // }
        // }
        for (Object obj : products) {
            System.out.println(obj);
        }
    }

    public void updateProductDetails(int index, int id, String name, String brand, String price) {
        // for (int i = 0; i < products.length; i++) {
        // if (products[i].getID() == id) {
        // products[i] = Product.createProduct(id, name, brand, price);
        // }
        // }
        products.set(index, Product.createProduct(id, name, brand, price));
    }

    // METHOD TO GET ALL PRODUCTS FROM products array
    public ArrayList<Product> getAllProducts() {
        return this.products;
    }

    // // METHOD TO GET SINGLE PRODUCTS FROM products array
    // public Product getProducts(int id) {
    // int index = 0;

    // for (int i = 0; i < products.length; i++) {
    // if (products[i].getID() == id) {
    // index = i;
    // }
    // }
    // return products[index];
    // }

    // TO GET CART // HELPER METHOD
    public void createCartObject() {
        this.cart = new Cart(products);
    }

    public Cart getCart() {
        return this.cart;
    }
}
