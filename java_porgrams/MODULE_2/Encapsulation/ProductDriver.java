public class ProductDriver {
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 1, 40000);
        Product p2 = new Product("Laptop", 1, 40000);

        System.out.println("******************PRODUCT DETAILS******************");
        System.out.println("NAME : " + p1.getName());
        System.out.println("ID : " + p1.getId());
        System.out.println("PRICE : " + p1.getPrice());

        p2.setName("Mobile");
        p2.setId(2);
        p2.setPrice(20000);

        System.out.println("******************PRODUCT DETAILS******************");
        System.out.println("NAME : " + p2.getName());
        System.out.println("ID : " + p2.getId());
        System.out.println("PRICE : " + p2.getPrice());
    }
}
