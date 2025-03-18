public class ProductIdException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong product id";
    }
}
