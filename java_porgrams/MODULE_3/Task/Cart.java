import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> amazonProducts = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public Cart() {

    }

    public Cart(ArrayList<Product> prod) {
        this.amazonProducts = prod;
    }

    public void addProductInCart(int id) {

        for (int i = 0; i < amazonProducts.size(); i++) {
            if (amazonProducts.get(i).getID() == id) {
                products.add(amazonProducts.get(i));
            }
        }
        // products.add(Product.createProduct(id, name, brand, price));
    }

    public void deleteProductFromCart(int id) {
        products.remove(id);
    }

    public void displayCart() {
        for (Object obj : products) {
            System.out.println(obj);
        }
    }
}
