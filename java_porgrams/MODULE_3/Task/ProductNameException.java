public class ProductNameException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong product name!";
    }
}
