public class ProductDriver {
    public static void main(String[] args) {

        Amazon a = new Amazon();

        a.addProduct(1, "Water", "Bisleri", "20");
        a.addProduct(2, "Cold Drink", "Coco-cola", "40");
        a.addProduct(3, "Mobile", "Samsung", "10000");
        a.addProduct(4, "Laptop", "Lenovo", "40000");
        a.displayAllProducts();

        // System.out.println("\n====After Update====");
        // a.updateProductDetails(1, "Mineral Water", "Bisleri", "60");
        // a.displayAllProducts();
        
        // System.out.println("\n====After Delete====");
        // a.removeProduct(2);
        // a.displayAllProducts();

        // CART
        a.createCartObject();
        a.getCart().addProductInCart(1);
        a.getCart().displayCart();
    }
}
