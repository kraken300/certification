public class ProductPriceException extends RuntimeException {
    @Override
    public String getMessage() {
        return "wrong price!";
    }
}
