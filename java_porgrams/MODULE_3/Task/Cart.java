public class Cart {
    private Product[] products = new Product[4];
    int count = 0;

    public Cart() {

    }

    public Cart(Product[] prod) {
        this.products = prod;
    }

    public void addProductInCart(int id) {
        if (count < products.length) {
            products[count++] = new Amazon().getProducts(id);
        }
    }

    public void deleteProductFromCart(int id) {

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

    public void displayCart() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }
}
