public class Amazon {
    private Product[] products = new Product[4];
    private Cart cart;

    int count = 0;

    public Amazon() {

    }

    public Amazon(Product[] prod) {

    }

    public void addProduct(int id, String name, String brand, String price) {
        if (count < products.length) {
            products[count++] = Product.createProduct(id, name, brand, price);
        }
    }

    public void removeProduct(int id) {

        Product[] updatedProducts = new Product[products.length - 1];

        int k = 0;
        for (int i = 0; i < products.length; i++) {

            if (products[i].getID() == id) {
                continue;
            }

            else {
                updatedProducts[k++] = products[i];
            }
        }

        products = updatedProducts;
    }

    public void displayAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public void updateProductDetails(int id, String name, String brand, String price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getID() == id) {
                products[i] = Product.createProduct(id, name, brand, price);
            }
        }
    }

    // METHOD TO GET ALL PRODUCTS FROM products array
    public Product[] getAllProducts() {
        return this.products;
    }

    // METHOD TO GET SINGLE PRODUCTS FROM products array
    public Product getProducts(int id) {
        int index = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getID() == id) {
                index = i;
            }
        }
        return products[index];
    }

    // TO GET CART
    public Cart createCartObject() {
        return this.cart = new Cart();
    }

    public Cart getCart() {
        return this.cart;
    }
}
