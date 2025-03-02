public class Book implements Comparable {
    private int id;
    private String name;
    private int price;

    public Book() {

    }

    public Book(int id, String name, int price) {
        setID(id);
        setName(name);
        setPrice(price);
    }

    // GETTERS
    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    // SETTERS
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n( " + " ID : " + id + ", NAME: " + name + ", PRICE : " + price + " )";
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        if (this.id < book.id) {
            return -1;
        } 
        else if (this.id == book.id) {
            return 0;
        } 
        else {
            return 1;
        }
    }
}
