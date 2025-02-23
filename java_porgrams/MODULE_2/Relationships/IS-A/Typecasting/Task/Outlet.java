public class Outlet {
    Customer customer;
    Fruit fruit;

    public Outlet() {

    }

    public Outlet(Customer customer, Fruit fruit) {
        this.customer = customer;
        this.fruit = fruit;
    }

    public void displayCart(Fruit fruit) {
        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;
            System.out.println("\n\n==========CART===========");
            apple.displayFruit();
        }

        else if (fruit instanceof Mango) {
            Mango mango = (Mango) fruit;
            System.out.println("\n\n==========CART===========");
            mango.displayFruit();
        }

        else if (fruit instanceof Strawberry) {
            Strawberry strawberry = (Strawberry) fruit;
            System.out.println("\n\n==========CART===========");
            strawberry.displayFruit();
        }
    }

    public void billGenerator(Fruit fruit) {
        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit;
            System.out.println("BILL : " + apple.price * apple.Qty);
        }

        else if (fruit instanceof Mango) {
            Mango mango = (Mango) fruit;
            System.out.println("BILL : " + mango.price * mango.Qty);
        }

        else if (fruit instanceof Strawberry) {
            Strawberry strawberry = (Strawberry) fruit;
            System.out.println("BILL : " + strawberry.price * strawberry.Qty);
        }
    }
}
