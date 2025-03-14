public class StudentAgeException extends Exception {
    @Override
    public String getMessage() {
        return "... Age should be a non-negative integer";
    }
}
